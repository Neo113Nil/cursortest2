package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.core.single;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l20.d;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerSubWidget;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.EntryBannerWidgetVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/core/single/EntryBannerWidgetSingleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerSubWidget$Single;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Single;", "<init>", "()V", "state", "info", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerSubWidget$Single;Ll20/d;)Ljava/util/List;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntryBannerWidgetSingleMapper implements Function2<EntryBannerSubWidget.Single, d, List<? extends EntryBannerWidgetVO.Single>> {
    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // kotlin.jvm.functions.Function2
    @org.jetbrains.annotations.NotNull
    public java.util.List<ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.EntryBannerWidgetVO.Single> invoke(@org.jetbrains.annotations.NotNull ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerSubWidget.Single r17, @org.jetbrains.annotations.NotNull l20.d r18) {
        /*
            r16 = this;
            java.lang.String r0 = "state"
            r1 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "info"
            r2 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = r2.d()
            int r0 = r0.hashCode()
            long r2 = (long) r0
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.EntryBannerWidgetVO$Single r0 = new ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.EntryBannerWidgetVO$Single
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.Banner r4 = new ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.Banner
            r5 = 1
            long r5 = r5 + r2
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner r7 = r1.getBanner()
            ru.ozon.uni.atoms.data.text.TextDTO r7 = r7.getTitle()
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.Banner$Badge r8 = new ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.Banner$Badge
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner r9 = r1.getBanner()
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner$TitleBadge r9 = r9.getTitleBadge()
            ru.ozon.uni.atoms.data.text.TextDTO r9 = r9.getText()
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner r10 = r1.getBanner()
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner$TitleBadge r10 = r10.getTitleBadge()
            java.lang.String r10 = r10.getIcon()
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner r11 = r1.getBanner()
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner$TitleBadge r11 = r11.getTitleBadge()
            java.lang.String r11 = r11.getBackgroundColor()
            r8.<init>(r9, r10, r11)
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner r9 = r1.getBanner()
            ru.ozon.uni.atoms.data.text.TextDTO r9 = r9.getSubtitle()
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner r10 = r1.getBanner()
            ru.ozon.uni.atoms.data.dsBadge.BadgeDTO r10 = r10.getBadge()
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.Banner$Images r11 = new ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.Banner$Images
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner r12 = r1.getBanner()
            java.lang.String r12 = r12.getUnderImage()
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner r13 = r1.getBanner()
            java.lang.String r13 = r13.getAnimationName()
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner r14 = r1.getBanner()
            java.lang.String r14 = r14.getOverImage()
            r11.<init>(r12, r13, r14)
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner r12 = r1.getBanner()
            java.lang.String r12 = r12.getBackgroundColor()
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner r13 = r1.getBanner()
            ru.ozon.uni.atoms.data.AtomActionDTO r13 = r13.getAction()
            r14 = 0
            if (r13 == 0) goto L9c
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner r15 = r1.getBanner()
            java.util.Map r15 = r15.getTrackingInfo()
            ru.ozon.uni.atoms.af.AtomAction r13 = ru.ozon.uni.atoms.data.AtomActionMapperKt.toAtomAction(r13, r15)
            goto L9d
        L9c:
            r13 = r14
        L9d:
            ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO$Banner r15 = r1.getBanner()
            java.util.Map r15 = r15.getTrackingInfo()
            if (r15 == 0) goto Lb4
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r18 = r4
            r4 = 2
            WZ.t r14 = ru.ozon.app.android.composer.TrackingInfoMapperKt.toTokenizedEvent$default(r15, r1, r14, r4, r14)
            r4 = r18
        Lb4:
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r1 = r17.getBackgroundColor()
            r0.<init>(r2, r4, r1)
            java.util.List r0 = kotlin.collections.C7714v.a0(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.core.single.EntryBannerWidgetSingleMapper.invoke(ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerSubWidget$Single, l20.d):java.util.List");
    }
}
