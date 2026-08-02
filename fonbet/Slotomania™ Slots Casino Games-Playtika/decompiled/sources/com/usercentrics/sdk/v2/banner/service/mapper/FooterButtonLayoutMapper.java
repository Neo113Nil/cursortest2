package com.usercentrics.sdk.v2.banner.service.mapper;

import com.usercentrics.sdk.models.settings.PredefinedUIFooterButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FooterButtonLayoutMapper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\nJ-\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u000e\"\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0002\u0010\u000fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/usercentrics/sdk/v2/banner/service/mapper/FooterButtonLayoutMapper;", "", "acceptAll", "Lcom/usercentrics/sdk/models/settings/PredefinedUIFooterButton;", "denyAll", "saveSettings", "okButton", "manageSettings", "(Lcom/usercentrics/sdk/models/settings/PredefinedUIFooterButton;Lcom/usercentrics/sdk/models/settings/PredefinedUIFooterButton;Lcom/usercentrics/sdk/models/settings/PredefinedUIFooterButton;Lcom/usercentrics/sdk/models/settings/PredefinedUIFooterButton;Lcom/usercentrics/sdk/models/settings/PredefinedUIFooterButton;)V", "mapButtons", "", "mapButtonsLandscape", "mapButtonsRow", "buttons", "", "([Lcom/usercentrics/sdk/models/settings/PredefinedUIFooterButton;)Ljava/util/List;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FooterButtonLayoutMapper {
    private final PredefinedUIFooterButton acceptAll;
    private final PredefinedUIFooterButton denyAll;
    private final PredefinedUIFooterButton manageSettings;
    private final PredefinedUIFooterButton okButton;
    private final PredefinedUIFooterButton saveSettings;

    public FooterButtonLayoutMapper() {
        this(null, null, null, null, null, 31, null);
    }

    public FooterButtonLayoutMapper(PredefinedUIFooterButton predefinedUIFooterButton, PredefinedUIFooterButton predefinedUIFooterButton2, PredefinedUIFooterButton predefinedUIFooterButton3, PredefinedUIFooterButton predefinedUIFooterButton4, PredefinedUIFooterButton predefinedUIFooterButton5) {
        this.acceptAll = predefinedUIFooterButton;
        this.denyAll = predefinedUIFooterButton2;
        this.saveSettings = predefinedUIFooterButton3;
        this.okButton = predefinedUIFooterButton4;
        this.manageSettings = predefinedUIFooterButton5;
    }

    public /* synthetic */ FooterButtonLayoutMapper(PredefinedUIFooterButton predefinedUIFooterButton, PredefinedUIFooterButton predefinedUIFooterButton2, PredefinedUIFooterButton predefinedUIFooterButton3, PredefinedUIFooterButton predefinedUIFooterButton4, PredefinedUIFooterButton predefinedUIFooterButton5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : predefinedUIFooterButton, (i & 2) != 0 ? null : predefinedUIFooterButton2, (i & 4) != 0 ? null : predefinedUIFooterButton3, (i & 8) != 0 ? null : predefinedUIFooterButton4, (i & 16) != 0 ? null : predefinedUIFooterButton5);
    }

    public final List<List<PredefinedUIFooterButton>> mapButtons() {
        return CollectionsKt.listOfNotNull((Object[]) new List[]{mapButtonsRow(this.denyAll, this.acceptAll), mapButtonsRow(this.okButton), mapButtonsRow(this.saveSettings), mapButtonsRow(this.manageSettings)});
    }

    public final List<List<PredefinedUIFooterButton>> mapButtonsLandscape() {
        return CollectionsKt.listOfNotNull(mapButtonsRow(this.manageSettings, this.okButton, this.saveSettings, this.denyAll, this.acceptAll));
    }

    private final List<PredefinedUIFooterButton> mapButtonsRow(PredefinedUIFooterButton... buttons) {
        List<PredefinedUIFooterButton> filterNotNull = ArraysKt.filterNotNull(buttons);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterNotNull, 10));
        for (PredefinedUIFooterButton predefinedUIFooterButton : filterNotNull) {
            arrayList.add(new PredefinedUIFooterButton(predefinedUIFooterButton.getLabel(), predefinedUIFooterButton.getType(), predefinedUIFooterButton.getCustomization()));
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }
}
