package ru.ozon.app.android.travel.utils.listtracking.compose;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.utils.listtracking.ListTrackingVO;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;

/* JADX INFO: Add missing generic type declarations: [S] */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "S", "Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/travel/utils/listtracking/ListTrackingVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ListTrackingComposeViewMapperSpecKt$listTrackingComposeViewMapperSpec$1<S> extends AbstractC7737t implements Function1<e<S, ListTrackingVO>, Unit> {
    public static final ListTrackingComposeViewMapperSpecKt$listTrackingComposeViewMapperSpec$1 INSTANCE = new ListTrackingComposeViewMapperSpecKt$listTrackingComposeViewMapperSpec$1();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "S", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/travel/utils/listtracking/ListTrackingVO;", "invoke", "(Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.utils.listtracking.compose.ListTrackingComposeViewMapperSpecKt$listTrackingComposeViewMapperSpec$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<S, d, List<? extends ListTrackingVO>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        /* JADX WARN: Incorrect types in method signature: (TS;Ll20/d;)Ljava/util/List<Lru/ozon/app/android/travel/utils/listtracking/ListTrackingVO;>; */
        @Override // kotlin.jvm.functions.Function2
        public final List invoke(TrackingInfoHolder state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
            List list = null;
            if (trackingInfo != null) {
                long hashCode = info.d().hashCode();
                list = C7714v.a0(new ListTrackingVO(hashCode, TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null)));
            }
            return list == null ? K.f71697a : list;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/travel/utils/listtracking/ListTrackingVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.utils.listtracking.compose.ListTrackingComposeViewMapperSpecKt$listTrackingComposeViewMapperSpec$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<f<ListTrackingVO>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f<ListTrackingVO> fVar) {
            invoke2(fVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(f<ListTrackingVO> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(ComposableSingletons$ListTrackingComposeViewMapperSpecKt.INSTANCE.m1449getLambda1$utils_prodGoogleAllVendorsRelease());
        }
    }

    ListTrackingComposeViewMapperSpecKt$listTrackingComposeViewMapperSpec$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((e) obj);
        return Unit.f71690a;
    }

    public final void invoke(e<S, ListTrackingVO> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        c.j(eVar, null, AnonymousClass1.INSTANCE, 1, null);
        eVar.s(d.e.f94687b, AnonymousClass2.INSTANCE);
    }
}
