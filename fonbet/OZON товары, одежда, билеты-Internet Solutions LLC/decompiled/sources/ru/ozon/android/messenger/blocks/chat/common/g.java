package ru.ozon.android.messenger.blocks.chat.common;

import B90.D;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.A;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.B;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.r;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$integer;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.app.android.messenger.databinding.MBlockChatBinding;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.C10727i;
import xe.M;

/* loaded from: classes10.dex */
public final class g implements A {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MBlockChatBinding f84514a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f84515b;

    /* renamed from: c, reason: collision with root package name */
    private D f84516c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.D f84517d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f84518e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f84519f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.chat.common.menuItems.d f84520g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f84521h;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84522a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f84523b;

        static {
            int[] iArr = new int[ru.ozon.android.messenger.blocks.chat.common.e.values().length];
            try {
                iArr[ru.ozon.android.messenger.blocks.chat.common.e.BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.ozon.android.messenger.blocks.chat.common.e.AVATAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ru.ozon.android.messenger.blocks.chat.common.e.INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f84522a = iArr;
            int[] iArr2 = new int[n.values().length];
            try {
                iArr2[n.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[n.MUTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f84523b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.chat.common.ChatViewDelegateImpl$bindPreview$1$1$1", f = "ChatViewDelegateImpl.kt", l = {157}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f84524d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MBlockChatBinding f84525e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ SpannableString f84526f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MBlockChatBinding mBlockChatBinding, SpannableString spannableString, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f84525e = mBlockChatBinding;
            this.f84526f = spannableString;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f84525e, this.f84526f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f84524d;
            if (i11 == 0) {
                s.b(obj);
                TextView chatPreviewTextTv = this.f84525e.chatPreviewTextTv;
                Intrinsics.checkNotNullExpressionValue(chatPreviewTextTv, "chatPreviewTextTv");
                this.f84524d = 1;
                if (ru.ozon.android.messenger.utils.view.n.b(chatPreviewTextTv, this.f84526f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.chat.common.ChatViewDelegateImpl$bindPreview$1$1$2", f = "ChatViewDelegateImpl.kt", l = {159}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f84527d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MBlockChatBinding f84528e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f84529f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MBlockChatBinding mBlockChatBinding, String str, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f84528e = mBlockChatBinding;
            this.f84529f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f84528e, this.f84529f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f84527d;
            if (i11 == 0) {
                s.b(obj);
                TextView chatPreviewTextTv = this.f84528e.chatPreviewTextTv;
                Intrinsics.checkNotNullExpressionValue(chatPreviewTextTv, "chatPreviewTextTv");
                this.f84527d = 1;
                if (ru.ozon.android.messenger.utils.view.n.b(chatPreviewTextTv, this.f84529f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.chat.common.ChatViewDelegateImpl$bindTitle$1$1", f = "ChatViewDelegateImpl.kt", l = {133}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f84530d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MBlockChatBinding f84531e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f84532f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MBlockChatBinding mBlockChatBinding, String str, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f84531e = mBlockChatBinding;
            this.f84532f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f84531e, this.f84532f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f84530d;
            if (i11 == 0) {
                s.b(obj);
                TextAtomV2View chatTitleTv = this.f84531e.chatTitleTv;
                Intrinsics.checkNotNullExpressionValue(chatTitleTv, "chatTitleTv");
                this.f84530d = 1;
                if (ru.ozon.android.messenger.utils.view.n.b(chatTitleTv, this.f84532f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function0<j> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final j invoke() {
            g gVar = g.this;
            Context k11 = gVar.k();
            Intrinsics.checkNotNullExpressionValue(k11, "access$getContext(...)");
            j jVar = new j(k11, 1150, Float.valueOf(ru.ozon.android.messenger.utils.h.d(104)), 1150, 1150);
            jVar.setAlpha(gVar.k().getResources().getInteger(R$integer.m_shimmer_animation_alpha));
            return jVar;
        }
    }

    static final class f extends AbstractC7737t implements Function0<j> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final j invoke() {
            g gVar = g.this;
            Context k11 = gVar.k();
            Intrinsics.checkNotNullExpressionValue(k11, "access$getContext(...)");
            j jVar = new j(k11, DescriptorProtos$Edition.EDITION_LEGACY_VALUE, Float.valueOf(ru.ozon.android.messenger.utils.h.d(80)), DescriptorProtos$Edition.EDITION_LEGACY_VALUE, DescriptorProtos$Edition.EDITION_LEGACY_VALUE);
            jVar.setAlpha(gVar.k().getResources().getInteger(R$integer.m_shimmer_animation_alpha));
            return jVar;
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.chat.common.g$g, reason: collision with other inner class name */
    static final class C1477g extends AbstractC7737t implements Function2<ru.ozon.android.messenger.framework.navigation.action.a, Map<String, ? extends MessengerTrackingInfo>, Unit> {
        C1477g() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(ru.ozon.android.messenger.framework.navigation.action.a aVar, Map<String, ? extends MessengerTrackingInfo> map) {
            ru.ozon.android.messenger.framework.navigation.action.a action = aVar;
            Map<String, ? extends MessengerTrackingInfo> map2 = map;
            Intrinsics.checkNotNullParameter(action, "action");
            g gVar = g.this;
            B.a l11 = gVar.l();
            if (l11 != null) {
                ((r) ((D) l11).f3100a).b();
            }
            if (map2 != null) {
                gVar.f84515b.c().m(map2);
            }
            gVar.f84515b.c().q(action);
            return Unit.f71690a;
        }
    }

    static final class h extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f84536b = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
            Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
            updateMarginLP.bottomMargin = 0;
            return Unit.f71690a;
        }
    }

    public g(@NotNull MBlockChatBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d refs) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.f84514a = binding;
        this.f84515b = refs;
        this.f84517d = K.a(refs.f());
        this.f84518e = Sc.k.b(new f());
        this.f84519f = Sc.k.b(new e());
        ru.ozon.android.messenger.blocks.chat.common.menuItems.d dVar = new ru.ozon.android.messenger.blocks.chat.common.menuItems.d(ru.ozon.android.messenger.utils.g.f(refs.d()), new C1477g());
        this.f84520g = dVar;
        Context k11 = k();
        Intrinsics.checkNotNullExpressionValue(k11, "<get-context>(...)");
        this.f84521h = ru.ozon.android.messenger.utils.c.d(R$string.messenger_draft_with_text, k11);
        RecyclerView recyclerView = binding.menuItemsRv;
        recyclerView.setAdapter(dVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context k() {
        return this.f84514a.getConstraintLayout().getContext();
    }

    private final void n(MBlockChatBinding mBlockChatBinding, List<Icon> list) {
        int i11;
        int i12;
        d.a f7 = ru.ozon.android.messenger.utils.g.f(this.f84515b.d());
        LinearLayout chatIconsLayout = mBlockChatBinding.chatIconsLayout;
        Intrinsics.checkNotNullExpressionValue(chatIconsLayout, "chatIconsLayout");
        i11 = ru.ozon.android.messenger.utils.e.f91905b;
        i12 = ru.ozon.android.messenger.utils.e.f91912i;
        Context k11 = k();
        Intrinsics.checkNotNullExpressionValue(k11, "<get-context>(...)");
        ru.ozon.android.messenger.utils.view.g.a(chatIconsLayout, list, f7, i11, i12, Integer.valueOf(ThemeExtKt.themeColorRes(k11, R$attr.textAction)));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.A
    public final int a() {
        RecyclerView recyclerView = this.f84514a.menuItemsRv;
        Intrinsics.f(recyclerView);
        if (recyclerView.getVisibility() == 0) {
            return recyclerView.getWidth();
        }
        return 0;
    }

    public final void d(ru.ozon.android.messenger.blocks.chat.common.e eVar) {
        MBlockChatBinding mBlockChatBinding = this.f84514a;
        ConstraintLayout constraintLayout = mBlockChatBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Drawable foreground = constraintLayout.getForeground();
        j jVar = foreground instanceof j ? (j) foreground : null;
        if (jVar != null) {
            jVar.b();
            constraintLayout.setForeground(null);
        }
        IconView avatarIv = mBlockChatBinding.avatarIv;
        Intrinsics.checkNotNullExpressionValue(avatarIv, "avatarIv");
        Intrinsics.checkNotNullParameter(avatarIv, "<this>");
        Drawable foreground2 = avatarIv.getForeground();
        j jVar2 = foreground2 instanceof j ? (j) foreground2 : null;
        if (jVar2 != null) {
            jVar2.b();
            avatarIv.setForeground(null);
        }
        if (eVar != null) {
            int i11 = a.f84522a[eVar.ordinal()];
            if (i11 == 1) {
                ConstraintLayout constraintLayout2 = mBlockChatBinding.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                k.a(constraintLayout2, (j) this.f84519f.getValue());
            } else if (i11 != 2) {
                if (i11 != 3) {
                    throw new o();
                }
            } else {
                IconView avatarIv2 = mBlockChatBinding.avatarIv;
                Intrinsics.checkNotNullExpressionValue(avatarIv2, "avatarIv");
                k.a(avatarIv2, (j) this.f84518e.getValue());
            }
        }
    }

    public final void e(IconDTO iconDTO, ru.ozon.android.messenger.blocks.chat.common.a aVar) {
        MBlockChatBinding mBlockChatBinding = this.f84514a;
        IconView avatarIv = mBlockChatBinding.avatarIv;
        Intrinsics.checkNotNullExpressionValue(avatarIv, "avatarIv");
        IconHolderKt.bindOrGone$default(avatarIv, iconDTO, null, 2, null);
        IconView avatarIv2 = mBlockChatBinding.avatarIv;
        Intrinsics.checkNotNullExpressionValue(avatarIv2, "avatarIv");
        ConstraintLayout constraintLayout = mBlockChatBinding.blockChatRootCl;
        androidx.constraintlayout.widget.d d11 = Tl.a.d(constraintLayout, "blockChatRootCl", constraintLayout);
        if (aVar != ru.ozon.android.messenger.blocks.chat.common.a.TOP) {
            d11.t(avatarIv2.getId(), 4, 0, 4, 0);
        }
        V4.n.a(constraintLayout, null);
        d11.f(constraintLayout);
    }

    public final void f(@NotNull List<ru.ozon.android.messenger.blocks.chat.common.menuItems.b> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f84520g.submitList(items);
        boolean isEmpty = items.isEmpty();
        MBlockChatBinding mBlockChatBinding = this.f84514a;
        if (isEmpty) {
            RecyclerView menuItemsRv = mBlockChatBinding.menuItemsRv;
            Intrinsics.checkNotNullExpressionValue(menuItemsRv, "menuItemsRv");
            ru.ozon.android.messenger.utils.view.s.a(menuItemsRv);
        } else {
            RecyclerView menuItemsRv2 = mBlockChatBinding.menuItemsRv;
            Intrinsics.checkNotNullExpressionValue(menuItemsRv2, "menuItemsRv");
            ru.ozon.android.messenger.utils.view.s.d(menuItemsRv2);
        }
    }

    public final void g(PreviewVO previewVO) {
        String str;
        int i11;
        int i12;
        int i13;
        List<Icon> images;
        String text;
        DateTime date;
        MBlockChatBinding mBlockChatBinding = this.f84514a;
        TextView chatPreviewDateTv = mBlockChatBinding.chatPreviewDateTv;
        Intrinsics.checkNotNullExpressionValue(chatPreviewDateTv, "chatPreviewDateTv");
        if (previewVO == null || (date = previewVO.getDate()) == null) {
            str = null;
        } else {
            Context k11 = k();
            Intrinsics.checkNotNullExpressionValue(k11, "<get-context>(...)");
            str = ru.ozon.android.messenger.utils.d.a(date, k11);
        }
        ru.ozon.android.messenger.utils.view.n.e(chatPreviewDateTv, str);
        d.a f7 = ru.ozon.android.messenger.utils.g.f(this.f84515b.d());
        if (previewVO != null && (text = previewVO.getText()) != null) {
            boolean isDraft = previewVO.isDraft();
            androidx.lifecycle.D d11 = this.f84517d;
            if (isDraft) {
                String format = String.format(this.f84521h, Arrays.copyOf(new Object[]{text}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                SpannableString spannableString = new SpannableString(format);
                spannableString.setSpan(new ForegroundColorSpan(k().getColor(R$color.text_primary)), 0, spannableString.length() - text.length(), 33);
                C10727i.c(d11, null, null, new b(mBlockChatBinding, spannableString, null), 3);
            } else {
                C10727i.c(d11, null, null, new c(mBlockChatBinding, text, null), 3);
            }
        }
        TextView chatPreviewTextTv = mBlockChatBinding.chatPreviewTextTv;
        Intrinsics.checkNotNullExpressionValue(chatPreviewTextTv, "chatPreviewTextTv");
        Icon icon = (previewVO == null || (images = previewVO.getImages()) == null) ? null : (Icon) C7714v.M(images);
        ru.ozon.android.messenger.utils.view.b bVar = ru.ozon.android.messenger.utils.view.b.START;
        i11 = ru.ozon.android.messenger.utils.e.f91906c;
        i12 = ru.ozon.android.messenger.utils.e.f91911h;
        i13 = ru.ozon.android.messenger.utils.e.f91911h;
        ru.ozon.android.messenger.utils.view.n.d(chatPreviewTextTv, icon, bVar, f7, i11, new Rect(0, 0, i12, i13));
        AppCompatImageView statusIv = mBlockChatBinding.statusIv;
        Intrinsics.checkNotNullExpressionValue(statusIv, "statusIv");
        ru.ozon.android.messenger.blocks.common.a.a(statusIv, previewVO != null ? previewVO.getStatus() : null);
    }

    public final void h(@NotNull String title, @NotNull List<Icon> titleIcons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleIcons, "titleIcons");
        MBlockChatBinding mBlockChatBinding = this.f84514a;
        mBlockChatBinding.chatTitleTv.setTextIsSelectable(false);
        C10727i.c(this.f84517d, null, null, new d(mBlockChatBinding, title, null), 3);
        n(mBlockChatBinding, titleIcons);
    }

    public final void i(@NotNull TextDTO titleAtom, @NotNull List<Icon> titleIcons) {
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        Intrinsics.checkNotNullParameter(titleIcons, "titleIcons");
        MBlockChatBinding mBlockChatBinding = this.f84514a;
        mBlockChatBinding.chatTitleTv.setTextIsSelectable(false);
        TextAtomV2View chatTitleTv = mBlockChatBinding.chatTitleTv;
        Intrinsics.checkNotNullExpressionValue(chatTitleTv, "chatTitleTv");
        TextHolderKt.bindOrGone$default(chatTitleTv, titleAtom, null, 2, null);
        n(mBlockChatBinding, titleIcons);
    }

    public final void j(@NotNull m unreadCountIndicator) {
        String string;
        IndicatorDTO.Style style;
        IndicatorDTO.Custom custom;
        Intrinsics.checkNotNullParameter(unreadCountIndicator, "unreadCountIndicator");
        MBlockChatBinding mBlockChatBinding = this.f84514a;
        IndicatorView indicatorView = mBlockChatBinding.chatUnreadCountIndicator;
        boolean z11 = unreadCountIndicator.b() != 0;
        Intrinsics.f(indicatorView);
        indicatorView.setVisibility(z11 ? 0 : 8);
        if (z11) {
            int b11 = unreadCountIndicator.b();
            if (b11 <= 99) {
                string = String.valueOf(b11);
            } else {
                string = k().getString(R$string.messenger_extra_chats_count);
                Intrinsics.f(string);
            }
            String str = string;
            n a11 = unreadCountIndicator.a();
            int[] iArr = a.f84523b;
            int i11 = iArr[a11.ordinal()];
            if (i11 == 1) {
                style = IndicatorDTO.Style.ACCENT_SECONDARY;
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                style = IndicatorDTO.Style.NEUTRAL;
            }
            IndicatorDTO.Style style2 = style;
            IndicatorDTO.IndicatorContent indicatorContent = IndicatorDTO.IndicatorContent.TEXT;
            IndicatorDTO.IndicatorSize indicatorSize = IndicatorDTO.IndicatorSize.SIZE_600;
            n a12 = unreadCountIndicator.a();
            Context context = mBlockChatBinding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int i12 = iArr[a12.ordinal()];
            if (i12 == 1) {
                custom = null;
            } else {
                if (i12 != 2) {
                    throw new o();
                }
                custom = new IndicatorDTO.Custom(Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.bgSecondary)), Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.textTertiary)), Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicTertiary)), null, 8, null);
            }
            IndicatorHolderKt.bind$default(indicatorView, new IndicatorDTO(str, null, indicatorSize, null, custom, indicatorContent, null, null, null, style2, null, 1482, null), null, 2, null);
            indicatorView.setLocatorTag(String.valueOf(unreadCountIndicator.b()));
        }
    }

    public final B.a l() {
        return this.f84516c;
    }

    public final void m(D d11) {
        this.f84516c = d11;
    }

    public final void o() {
        MBlockChatBinding mBlockChatBinding = this.f84514a;
        mBlockChatBinding.barrierChatTitleTop.e(0);
        Group sxExtendedInfoGroup = mBlockChatBinding.sxExtendedInfoGroup;
        Intrinsics.checkNotNullExpressionValue(sxExtendedInfoGroup, "sxExtendedInfoGroup");
        ru.ozon.android.messenger.utils.view.s.a(sxExtendedInfoGroup);
        TextView chatPreviewTextTv = mBlockChatBinding.chatPreviewTextTv;
        Intrinsics.checkNotNullExpressionValue(chatPreviewTextTv, "chatPreviewTextTv");
        ru.ozon.android.messenger.utils.view.s.f(chatPreviewTextTv, h.f84536b);
        mBlockChatBinding.chatTitleTv.setMaxLines(1);
    }
}
