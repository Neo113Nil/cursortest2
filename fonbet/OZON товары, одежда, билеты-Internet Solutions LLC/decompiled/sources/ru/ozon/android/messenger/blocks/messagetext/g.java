package ru.ozon.android.messenger.blocks.messagetext;

import android.text.Spannable;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.K;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.i;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.common.view.timestatus.TimeStatusView;
import ru.ozon.android.messenger.framework.presentation.models.C9515b;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.android.messenger.utils.view.TightTextView;
import ru.ozon.app.android.messenger.databinding.MBlockTextBinding;
import ru.ozon.uni.atoms.data.button.Icon;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class g extends q<f, MBlockTextBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f85870a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<ru.ozon.android.messenger.framework.navigation.action.a, Map<String, MessengerTrackingInfo>, Unit> f85871b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<ru.ozon.android.messenger.framework.navigation.action.a, Unit> f85872c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85873a;

        static {
            int[] iArr = new int[i.a.values().length];
            try {
                iArr[i.a.STATUS_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f85873a = iArr;
        }
    }

    static final class b extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.navigation.action.a, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ru.ozon.android.messenger.framework.navigation.action.a aVar) {
            ru.ozon.android.messenger.framework.navigation.action.a action = aVar;
            Intrinsics.checkNotNullParameter(action, "action");
            g.this.f85870a.c().q(action);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function2<ru.ozon.android.messenger.framework.navigation.action.a, Map<String, ? extends MessengerTrackingInfo>, Unit> {
        c() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(ru.ozon.android.messenger.framework.navigation.action.a aVar, Map<String, ? extends MessengerTrackingInfo> map) {
            Map<String, ? extends MessengerTrackingInfo> map2 = map;
            Intrinsics.checkNotNullParameter(aVar, "<unused var>");
            if (map2 != null) {
                g.this.f85870a.c().m(map2);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull MBlockTextBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85870a = references;
        this.f85871b = new c();
        this.f85872c = new b();
    }

    private static void c(MBlockTextBinding mBlockTextBinding, f fVar, s sVar) {
        z k11 = sVar.k();
        z k12 = (Intrinsics.d(k11, z.e.f91567a) || Intrinsics.d(k11, z.f.f91568a)) ? fVar.getSendTime() != null ? sVar.k() : z.d.f91566a : sVar.k();
        String sendTime = fVar.getSendTime();
        if (sendTime == null) {
            sendTime = "";
        }
        ru.ozon.android.messenger.framework.presentation.common.view.timestatus.d dVar = new ru.ozon.android.messenger.framework.presentation.common.view.timestatus.d(sendTime, k12, sVar.n());
        TimeStatusView timeStatusView = mBlockTextBinding.timeStatusView;
        Intrinsics.checkNotNullExpressionValue(timeStatusView, "timeStatusView");
        dVar.a(timeStatusView);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(f fVar, ru.ozon.android.messenger.framework.presentation.models.p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        int i11;
        int i12;
        f block = fVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        if (!(itemInfo instanceof s)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        MBlockTextBinding binding = getBinding();
        super.bind(block, itemInfo, blockInfo, obj);
        if (obj != null) {
            List list = obj instanceof List ? (List) obj : null;
            if (list == null || list.isEmpty()) {
                list = C7705l.f0(i.a.values());
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (a.f85873a[((i.a) ((Enum) it.next())).ordinal()] != 1) {
                    throw new Sc.o();
                }
                c(binding, block, (s) itemInfo);
            }
            return;
        }
        s sVar = (s) itemInfo;
        c(binding, block, sVar);
        AppCompatTextView authorNameTv = binding.authorNameTv;
        Intrinsics.checkNotNullExpressionValue(authorNameTv, "authorNameTv");
        ru.ozon.android.messenger.utils.view.n.e(authorNameTv, block.a());
        LinearLayout authorIcons = binding.authorIcons;
        Intrinsics.checkNotNullExpressionValue(authorIcons, "authorIcons");
        C9515b e11 = sVar.e();
        List<Icon> b11 = e11 != null ? e11.b() : null;
        ru.ozon.android.messenger.framework.core.d dVar = this.f85870a;
        if (b11 == null) {
            Intrinsics.checkNotNullParameter(authorIcons, "<this>");
            authorIcons.setVisibility(4);
            authorIcons.removeAllViews();
            ru.ozon.android.messenger.utils.view.s.f(authorIcons, h.f85876b);
        } else {
            d.a f7 = ru.ozon.android.messenger.utils.g.f(dVar.d());
            ru.ozon.android.messenger.utils.view.s.f(authorIcons, new i(this));
            i11 = ru.ozon.android.messenger.utils.e.f91905b;
            i12 = ru.ozon.android.messenger.utils.e.f91911h;
            ru.ozon.android.messenger.utils.view.g.a(authorIcons, b11, f7, i11, i12, null);
            ru.ozon.android.messenger.utils.view.s.d(authorIcons);
        }
        Spannable d11 = block.d();
        ru.ozon.android.messenger.utils.spans.a[] aVarArr = (ru.ozon.android.messenger.utils.spans.a[]) d11.getSpans(0, d11.length(), ru.ozon.android.messenger.utils.spans.a.class);
        Intrinsics.f(aVarArr);
        for (ru.ozon.android.messenger.utils.spans.a aVar : aVarArr) {
            aVar.c(this.f85871b);
            aVar.b(this.f85872c);
        }
        TightTextView tightTextView = binding.textTv;
        C10727i.c(K.a(dVar.f()), null, null, new j(tightTextView, d11, null), 3);
        tightTextView.setMovementMethod(new k(binding));
    }
}
