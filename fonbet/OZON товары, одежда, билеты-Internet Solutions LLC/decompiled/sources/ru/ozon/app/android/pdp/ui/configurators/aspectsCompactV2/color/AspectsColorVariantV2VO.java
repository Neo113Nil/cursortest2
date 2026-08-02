package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.color;

import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$VariantV2;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\b\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u000b\u0010\u001cR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/color/AspectsColorVariantV2VO;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$VariantV2;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "refreshDeeplink", "", "isSelected", "isAvailable", "LWZ/t;", "tokenizedEvent", "isEnabled", "", "", "colors", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZZLWZ/t;ZLjava/util/List;)V", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getRefreshDeeplink", "()Ljava/lang/String;", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getColors", "()Ljava/util/List;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsColorVariantV2VO implements AspectsCompactVO$VariantV2 {

    @NotNull
    private final List<Integer> colors;
    private final boolean isAvailable;
    private final boolean isEnabled;
    private final boolean isSelected;

    @NotNull
    private final String refreshDeeplink;

    @NotNull
    private final OzonSpannableString title;
    private final t tokenizedEvent;

    public AspectsColorVariantV2VO(@NotNull OzonSpannableString title, @NotNull String refreshDeeplink, boolean z11, boolean z12, t tVar, boolean z13, @NotNull List<Integer> colors) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.title = title;
        this.refreshDeeplink = refreshDeeplink;
        this.isSelected = z11;
        this.isAvailable = z12;
        this.tokenizedEvent = tVar;
        this.isEnabled = z13;
        this.colors = colors;
    }

    @NotNull
    public final List<Integer> getColors() {
        return this.colors;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant
    @NotNull
    public String getRefreshDeeplink() {
        return this.refreshDeeplink;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant
    @NotNull
    public OzonSpannableString getTitle() {
        return this.title;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant
    public t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant
    /* renamed from: isAvailable, reason: from getter */
    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    @NotNull
    public Boolean isEnabled() {
        return Boolean.valueOf(this.isEnabled);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant
    /* renamed from: isSelected, reason: from getter */
    public boolean getIsSelected() {
        return this.isSelected;
    }

    public /* synthetic */ AspectsColorVariantV2VO(OzonSpannableString ozonSpannableString, String str, boolean z11, boolean z12, t tVar, boolean z13, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new OzonSpannableString() : ozonSpannableString, str, z11, z12, tVar, z13, list);
    }
}
