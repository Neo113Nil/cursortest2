package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import android.content.Context;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.common.HighlightLinearLayout;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.i;
import ru.ozon.android.messenger.framework.presentation.models.C9515b;
import ru.ozon.android.messenger.framework.presentation.models.t;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$dimen;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.databinding.MMessageBaseLayoutBinding;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

/* loaded from: classes10.dex */
public final class m extends k implements D {

    /* renamed from: l, reason: collision with root package name */
    private static final float f91249l;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final MMessageBaseLayoutBinding f91250h;

    /* renamed from: i, reason: collision with root package name */
    private String f91251i;

    /* renamed from: j, reason: collision with root package name */
    private final int f91252j;

    /* renamed from: k, reason: collision with root package name */
    private final int f91253k;

    static final class a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<ru.ozon.android.messenger.framework.presentation.models.q, Integer, Unit> f91254b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f91255c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super ru.ozon.android.messenger.framework.presentation.models.q, ? super Integer, Unit> function2, m mVar) {
            super(1);
            this.f91254b = function2;
            this.f91255c = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
            ru.ozon.android.messenger.framework.presentation.models.q itemVo = qVar;
            Intrinsics.checkNotNullParameter(itemVo, "itemVo");
            this.f91254b.invoke(itemVo, Integer.valueOf(this.f91255c.getAdapterPosition()));
            return Unit.f71690a;
        }
    }

    static {
        float f7;
        f7 = ru.ozon.android.messenger.utils.e.f91923t;
        f91249l = f7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(@NotNull MMessageBaseLayoutBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references, @NotNull C9512c blockCache, @NotNull Function2<? super ru.ozon.android.messenger.framework.presentation.models.q, ? super Integer, Unit> showPopupMenu) {
        super(r0, references, blockCache);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(blockCache, "blockCache");
        Intrinsics.checkNotNullParameter(showPopupMenu, "showPopupMenu");
        LinearLayoutCompat constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.f91250h = binding;
        this.f91252j = getContext().getResources().getDimensionPixelSize(R$dimen.m_big_message_padding);
        this.f91253k = getContext().getResources().getDimensionPixelSize(R$dimen.m_small_message_padding);
        a aVar = new a(showPopupMenu, this);
        LinearLayoutCompat messageItemRootLl = binding.messageItemRootLl;
        Intrinsics.checkNotNullExpressionValue(messageItemRootLl, "messageItemRootLl");
        ru.ozon.android.messenger.utils.view.s.c(messageItemRootLl, new n(this, aVar));
        HighlightLinearLayout bubbleContainerLl = binding.bubbleContainerLl;
        Intrinsics.checkNotNullExpressionValue(bubbleContainerLl, "bubbleContainerLl");
        ru.ozon.android.messenger.utils.view.s.c(bubbleContainerLl, new o(binding));
    }

    private final Context getContext() {
        return this.f91250h.getConstraintLayout().getContext();
    }

    private final void l(MMessageBaseLayoutBinding mMessageBaseLayoutBinding, ru.ozon.android.messenger.framework.presentation.models.s sVar) {
        int i11;
        ru.ozon.android.messenger.framework.presentation.models.t j11 = sVar.j();
        if (Intrinsics.d(j11, t.c.f91549a) || (j11 instanceof t.a)) {
            HighlightLinearLayout bubbleContainerLl = mMessageBaseLayoutBinding.bubbleContainerLl;
            Intrinsics.checkNotNullExpressionValue(bubbleContainerLl, "bubbleContainerLl");
            ru.ozon.android.messenger.utils.view.s.h(bubbleContainerLl, -2);
            LinearLayoutCompat linearLayoutCompat = mMessageBaseLayoutBinding.messageItemRootLl;
            if (sVar.p()) {
                Intrinsics.f(linearLayoutCompat);
                ru.ozon.android.messenger.utils.view.s.g(linearLayoutCompat, this.f91252j, 0, this.f91253k, 0, 10);
                i11 = 8388613;
            } else {
                boolean z11 = (sVar.j() instanceof t.a) && !((t.a) sVar.j()).a();
                Intrinsics.f(linearLayoutCompat);
                ru.ozon.android.messenger.utils.view.s.g(linearLayoutCompat, z11 ? this.f91252j : this.f91253k, 0, this.f91252j, 0, 10);
                i11 = 8388611;
            }
            linearLayoutCompat.setGravity(i11);
        } else if (Intrinsics.d(j11, t.d.f91550a)) {
            mMessageBaseLayoutBinding.bubbleContainerLl.setElevation(f91249l);
            HighlightLinearLayout bubbleContainerLl2 = mMessageBaseLayoutBinding.bubbleContainerLl;
            Intrinsics.checkNotNullExpressionValue(bubbleContainerLl2, "bubbleContainerLl");
            ru.ozon.android.messenger.utils.view.s.h(bubbleContainerLl2, -1);
            LinearLayoutCompat constraintLayout = mMessageBaseLayoutBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            int i12 = this.f91253k;
            ru.ozon.android.messenger.utils.view.s.g(constraintLayout, i12, 0, i12, 0, 10);
        } else {
            if (!Intrinsics.d(j11, t.b.f91548a)) {
                throw new Sc.o();
            }
            HighlightLinearLayout bubbleContainerLl3 = mMessageBaseLayoutBinding.bubbleContainerLl;
            Intrinsics.checkNotNullExpressionValue(bubbleContainerLl3, "bubbleContainerLl");
            ru.ozon.android.messenger.utils.view.s.h(bubbleContainerLl3, -1);
            LinearLayoutCompat constraintLayout2 = mMessageBaseLayoutBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            ru.ozon.android.messenger.utils.view.s.g(constraintLayout2, 0, 0, 0, 0, 10);
        }
        ru.ozon.android.messenger.framework.presentation.models.t j12 = sVar.j();
        t.a aVar = j12 instanceof t.a ? (t.a) j12 : null;
        boolean z12 = aVar != null && aVar.a();
        if (z12) {
            C9515b e11 = sVar.e();
            if ((e11 != null ? e11.a() : null) != null) {
                IconView avatarIv = mMessageBaseLayoutBinding.avatarIv;
                Intrinsics.checkNotNullExpressionValue(avatarIv, "avatarIv");
                IconHolderKt.bind$default(avatarIv, sVar.e().a(), null, 2, null);
            }
        }
        IconView avatarIv2 = mMessageBaseLayoutBinding.avatarIv;
        Intrinsics.checkNotNullExpressionValue(avatarIv2, "avatarIv");
        avatarIv2.setVisibility(z12 ? 0 : 8);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.D
    public final String c() {
        return this.f91251i;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.D
    public final void d() {
        this.f91251i = null;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.k
    public final void e(@NotNull ru.ozon.android.messenger.framework.presentation.models.q item) {
        Intrinsics.checkNotNullParameter(item, "item");
        HighlightLinearLayout highlightLinearLayout = this.f91250h.bubbleContainerLl;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "<get-context>(...)");
        int i11 = R$color.oz_aqua_brand;
        Intrinsics.checkNotNullParameter(context, "<this>");
        highlightLinearLayout.j(androidx.core.content.a.getColor(context, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (kotlin.text.h.e0(r3, "LOCAL_", false) == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029a  */
    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(@NotNull ru.ozon.android.messenger.framework.presentation.models.q item, Object obj) {
        int i11;
        int i12;
        int i13;
        a.AbstractC1563a.b bVar;
        Float a11;
        Integer b11;
        Integer d11;
        Object obj2;
        List<Object> list;
        Intrinsics.checkNotNullParameter(item, "item");
        String d12 = ru.ozon.android.messenger.framework.presentation.models.r.d(item);
        ru.ozon.android.messenger.framework.presentation.models.s f7 = ru.ozon.android.messenger.framework.presentation.models.r.f(item);
        Integer num = null;
        if (f7 != null && f7.t()) {
            Intrinsics.checkNotNullParameter(d12, "<this>");
        }
        d12 = null;
        this.f91251i = d12;
        MMessageBaseLayoutBinding mMessageBaseLayoutBinding = this.f91250h;
        mMessageBaseLayoutBinding.bubbleContainerLl.k();
        i.c cVar = obj instanceof i.c ? (i.c) obj : null;
        if (cVar != null) {
            if (cVar.b()) {
                ru.ozon.android.messenger.framework.presentation.models.p c11 = item.c();
                Intrinsics.g(c11, "null cannot be cast to non-null type ru.ozon.android.messenger.framework.presentation.models.MessageItemInfo");
                l(mMessageBaseLayoutBinding, (ru.ozon.android.messenger.framework.presentation.models.s) c11);
            }
            Collection<List<q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a>>> values = j().values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            Iterator it = C7714v.N(values).iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                ru.ozon.android.messenger.framework.presentation.models.g boundedData = qVar.getBoundedData();
                if (boundedData != null) {
                    ArrayList arrayList = new ArrayList();
                    HashMap<ru.ozon.android.messenger.framework.presentation.models.c, List<Object>> c12 = cVar.c();
                    if (c12 != null && (list = c12.get(boundedData.getBlockId())) != null) {
                        arrayList.addAll(list);
                    }
                    if (cVar.d()) {
                        arrayList.add(i.a.STATUS_CHANGED);
                    }
                    Iterator<T> it2 = item.b().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        ru.ozon.android.messenger.framework.presentation.models.u uVar = (ru.ozon.android.messenger.framework.presentation.models.u) obj2;
                        if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.v.a(uVar), boundedData.getBlockId()) && uVar.c().getClass() == boundedData.getClass()) {
                            break;
                        }
                    }
                    ru.ozon.android.messenger.framework.presentation.models.u uVar2 = (ru.ozon.android.messenger.framework.presentation.models.u) obj2;
                    if (uVar2 != null) {
                        qVar.bind(uVar2.c(), item.c(), uVar2.b(), arrayList);
                    }
                }
            }
            return;
        }
        ru.ozon.android.messenger.framework.presentation.models.p c13 = item.c();
        Intrinsics.g(c13, "null cannot be cast to non-null type ru.ozon.android.messenger.framework.presentation.models.MessageItemInfo");
        ru.ozon.android.messenger.framework.presentation.models.s sVar = (ru.ozon.android.messenger.framework.presentation.models.s) c13;
        List<ru.ozon.android.messenger.framework.presentation.models.u> b12 = item.b();
        ArrayList arrayList2 = new ArrayList(C7714v.z(b12, 10));
        Iterator<T> it3 = b12.iterator();
        while (it3.hasNext()) {
            a.AbstractC1563a blockContainerSettings = ru.ozon.android.messenger.framework.data.d.a(k().a(), ((ru.ozon.android.messenger.framework.presentation.models.u) it3.next()).e()).getBlockContainerSettings();
            Intrinsics.g(blockContainerSettings, "null cannot be cast to non-null type ru.ozon.android.messenger.framework.core.viewmapper.BlockViewMapper.BlockContainerSettings.Message");
            arrayList2.add((a.AbstractC1563a.b) blockContainerSettings);
        }
        HighlightLinearLayout highlightLinearLayout = mMessageBaseLayoutBinding.bubbleContainerLl;
        highlightLinearLayout.removeAllViews();
        highlightLinearLayout.setElevation(0.0f);
        i11 = ru.ozon.android.messenger.utils.e.f91908e;
        i12 = ru.ozon.android.messenger.utils.e.f91908e;
        ru.ozon.android.messenger.utils.view.s.g(highlightLinearLayout, 0, i11, 0, i12, 5);
        a.AbstractC1563a.b bVar2 = (a.AbstractC1563a.b) C7714v.M(arrayList2);
        if (bVar2 != null && (d11 = bVar2.d()) != null) {
            int intValue = d11.intValue();
            HighlightLinearLayout bubbleContainerLl = mMessageBaseLayoutBinding.bubbleContainerLl;
            Intrinsics.checkNotNullExpressionValue(bubbleContainerLl, "bubbleContainerLl");
            ru.ozon.android.messenger.utils.view.s.g(bubbleContainerLl, 0, intValue, 0, 0, 13);
        }
        a.AbstractC1563a.b bVar3 = (a.AbstractC1563a.b) C7714v.Z(arrayList2);
        if (bVar3 != null && (b11 = bVar3.b()) != null) {
            int intValue2 = b11.intValue();
            HighlightLinearLayout bubbleContainerLl2 = mMessageBaseLayoutBinding.bubbleContainerLl;
            Intrinsics.checkNotNullExpressionValue(bubbleContainerLl2, "bubbleContainerLl");
            ru.ozon.android.messenger.utils.view.s.g(bubbleContainerLl2, 0, 0, 0, intValue2, 7);
        }
        if (arrayList2.size() == 1 && (bVar = (a.AbstractC1563a.b) C7714v.K(arrayList2)) != null && (a11 = bVar.a()) != null) {
            mMessageBaseLayoutBinding.bubbleContainerLl.setElevation(a11.floatValue());
        }
        a.AbstractC1563a.b bVar4 = (a.AbstractC1563a.b) C7714v.M(arrayList2);
        int i14 = Intrinsics.d(sVar.j(), t.d.f91550a) ? R$drawable.m_bg_wide_message : Intrinsics.d(sVar.j(), t.b.f91548a) ? 0 : sVar.p() ? R$drawable.m_bg_my_message : R$drawable.m_bg_other_message;
        Boolean valueOf = Boolean.valueOf((bVar4 != null ? bVar4.e() : null) != null);
        Boolean valueOf2 = Boolean.valueOf(sVar.p());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "<get-context>(...)");
        List b02 = C7714v.b0(valueOf, valueOf2, Boolean.valueOf(true ^ ru.ozon.android.messenger.utils.h.b(context)));
        if (!(b02 instanceof Collection) || !b02.isEmpty()) {
            Iterator it4 = b02.iterator();
            while (it4.hasNext()) {
                if (!((Boolean) it4.next()).booleanValue()) {
                    if ((bVar4 != null ? bVar4.c() : null) != null) {
                        num = bVar4.c();
                    } else if (Intrinsics.d(sVar.j(), t.d.f91550a)) {
                        Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "<get-context>(...)");
                        num = Integer.valueOf(ThemeExtKt.themeColorRes(context2, R$attr.layerFloor2));
                    } else if (!Intrinsics.d(sVar.j(), t.b.f91548a)) {
                        if (sVar.p()) {
                            Context context3 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "<get-context>(...)");
                            i13 = ru.ozon.android.messenger.utils.h.b(context3) ? R$color.bg_secondary : R$color.bg_action_secondary;
                        } else {
                            i13 = R$color.bg_primary;
                        }
                        num = Integer.valueOf(i13);
                    }
                    HighlightLinearLayout highlightLinearLayout2 = mMessageBaseLayoutBinding.bubbleContainerLl;
                    highlightLinearLayout2.setBackgroundResource(i14);
                    if (num != null) {
                        Context context4 = highlightLinearLayout2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        int intValue3 = num.intValue();
                        Intrinsics.checkNotNullParameter(context4, "<this>");
                        ru.ozon.android.messenger.utils.view.s.b(highlightLinearLayout2, androidx.core.content.a.getColor(context4, intValue3));
                    }
                    l(mMessageBaseLayoutBinding, sVar);
                    HighlightLinearLayout bubbleContainerLl3 = mMessageBaseLayoutBinding.bubbleContainerLl;
                    Intrinsics.checkNotNullExpressionValue(bubbleContainerLl3, "bubbleContainerLl");
                    g(bubbleContainerLl3, item);
                }
            }
        }
        if (bVar4 != null) {
            num = bVar4.e();
        }
        HighlightLinearLayout highlightLinearLayout22 = mMessageBaseLayoutBinding.bubbleContainerLl;
        highlightLinearLayout22.setBackgroundResource(i14);
        if (num != null) {
        }
        l(mMessageBaseLayoutBinding, sVar);
        HighlightLinearLayout bubbleContainerLl32 = mMessageBaseLayoutBinding.bubbleContainerLl;
        Intrinsics.checkNotNullExpressionValue(bubbleContainerLl32, "bubbleContainerLl");
        g(bubbleContainerLl32, item);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.k
    public final void h() {
        this.f91250h.bubbleContainerLl.k();
    }
}
