package ru.ozon.app.android.pdp.widgets.crosssale.presentation;

import Ak.C2436a;
import G.g;
import Nh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import m10.m;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.widgets.crosssale.data.CrossSaleDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u00042\u00020\u0005BY\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b&\u0010\u0017R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010\u0017¨\u00065"}, d2 = {"Lru/ozon/app/android/pdp/widgets/crosssale/presentation/CrossSaleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lm10/m;", "Lm10/o;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "deeplink", "", "images", "Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem$Subitems;", "subitems", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem$Subitems;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDeeplink", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem$Subitems;", "getSubitems", "()Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem$Subitems;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgetName", "getWidgetName", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CrossSaleVO implements c, InterfaceC8039a, m, o {
    private final String deeplink;
    private final long id;
    private final List<String> images;
    private final OnBoardingDTO onboarding;
    private final CrossSaleDTO.CrossSaleItem.Subitems subitems;
    private final String subtitle;

    @NotNull
    private final String title;
    private final t tokenizedEvent;

    @NotNull
    private final String widgetName;

    public CrossSaleVO(long j11, @NotNull String title, String str, String str2, List<String> list, CrossSaleDTO.CrossSaleItem.Subitems subitems, OnBoardingDTO onBoardingDTO, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.subtitle = str;
        this.deeplink = str2;
        this.images = list;
        this.subitems = subitems;
        this.onboarding = onBoardingDTO;
        this.tokenizedEvent = tVar;
        this.widgetName = "pdp_crossale";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossSaleVO)) {
            return false;
        }
        CrossSaleVO crossSaleVO = (CrossSaleVO) other;
        return this.id == crossSaleVO.id && Intrinsics.d(this.title, crossSaleVO.title) && Intrinsics.d(this.subtitle, crossSaleVO.subtitle) && Intrinsics.d(this.deeplink, crossSaleVO.deeplink) && Intrinsics.d(this.images, crossSaleVO.images) && Intrinsics.d(this.subitems, crossSaleVO.subitems) && Intrinsics.d(this.onboarding, crossSaleVO.onboarding) && Intrinsics.d(this.tokenizedEvent, crossSaleVO.tokenizedEvent);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final CrossSaleDTO.CrossSaleItem.Subitems getSubitems() {
        return this.subitems;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deeplink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.images;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CrossSaleDTO.CrossSaleItem.Subitems subitems = this.subitems;
        int hashCode4 = (hashCode3 + (subitems == null ? 0 : subitems.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode5 = (hashCode4 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.deeplink;
        List<String> list = this.images;
        CrossSaleDTO.CrossSaleItem.Subitems subitems = this.subitems;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "CrossSaleVO(id=", ", title=", str);
        a.h(c11, ", subtitle=", str2, ", deeplink=", str3);
        c11.append(", images=");
        c11.append(list);
        c11.append(", subitems=");
        c11.append(subitems);
        c11.append(", onboarding=");
        c11.append(onBoardingDTO);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(")");
        return c11.toString();
    }
}
