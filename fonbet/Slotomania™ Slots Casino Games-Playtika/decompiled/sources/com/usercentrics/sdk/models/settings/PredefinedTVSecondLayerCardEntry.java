package com.usercentrics.sdk.models.settings;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PredefinedUIDataTV.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerCardEntry;", "", "id", "", "title", "description", "toggle", "Lcom/usercentrics/sdk/models/settings/PredefinedUIToggleSettings;", "content", "Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerSettingsContent;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usercentrics/sdk/models/settings/PredefinedUIToggleSettings;Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerSettingsContent;)V", "getContent", "()Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerSettingsContent;", "getDescription", "()Ljava/lang/String;", "getId", "getTitle", "getToggle", "()Lcom/usercentrics/sdk/models/settings/PredefinedUIToggleSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PredefinedTVSecondLayerCardEntry {
    private final PredefinedTVSecondLayerSettingsContent content;
    private final String description;
    private final String id;
    private final String title;
    private final PredefinedUIToggleSettings toggle;

    public static /* synthetic */ PredefinedTVSecondLayerCardEntry copy$default(PredefinedTVSecondLayerCardEntry predefinedTVSecondLayerCardEntry, String str, String str2, String str3, PredefinedUIToggleSettings predefinedUIToggleSettings, PredefinedTVSecondLayerSettingsContent predefinedTVSecondLayerSettingsContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = predefinedTVSecondLayerCardEntry.id;
        }
        if ((i & 2) != 0) {
            str2 = predefinedTVSecondLayerCardEntry.title;
        }
        if ((i & 4) != 0) {
            str3 = predefinedTVSecondLayerCardEntry.description;
        }
        if ((i & 8) != 0) {
            predefinedUIToggleSettings = predefinedTVSecondLayerCardEntry.toggle;
        }
        if ((i & 16) != 0) {
            predefinedTVSecondLayerSettingsContent = predefinedTVSecondLayerCardEntry.content;
        }
        PredefinedTVSecondLayerSettingsContent predefinedTVSecondLayerSettingsContent2 = predefinedTVSecondLayerSettingsContent;
        String str4 = str3;
        return predefinedTVSecondLayerCardEntry.copy(str, str2, str4, predefinedUIToggleSettings, predefinedTVSecondLayerSettingsContent2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final PredefinedUIToggleSettings getToggle() {
        return this.toggle;
    }

    /* renamed from: component5, reason: from getter */
    public final PredefinedTVSecondLayerSettingsContent getContent() {
        return this.content;
    }

    public final PredefinedTVSecondLayerCardEntry copy(String id, String title, String description, PredefinedUIToggleSettings toggle, PredefinedTVSecondLayerSettingsContent content) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        return new PredefinedTVSecondLayerCardEntry(id, title, description, toggle, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredefinedTVSecondLayerCardEntry)) {
            return false;
        }
        PredefinedTVSecondLayerCardEntry predefinedTVSecondLayerCardEntry = (PredefinedTVSecondLayerCardEntry) other;
        return Intrinsics.areEqual(this.id, predefinedTVSecondLayerCardEntry.id) && Intrinsics.areEqual(this.title, predefinedTVSecondLayerCardEntry.title) && Intrinsics.areEqual(this.description, predefinedTVSecondLayerCardEntry.description) && Intrinsics.areEqual(this.toggle, predefinedTVSecondLayerCardEntry.toggle) && Intrinsics.areEqual(this.content, predefinedTVSecondLayerCardEntry.content);
    }

    public int hashCode() {
        int hashCode = ((this.id.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PredefinedUIToggleSettings predefinedUIToggleSettings = this.toggle;
        return ((hashCode2 + (predefinedUIToggleSettings != null ? predefinedUIToggleSettings.hashCode() : 0)) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "PredefinedTVSecondLayerCardEntry(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", toggle=" + this.toggle + ", content=" + this.content + ")";
    }

    public PredefinedTVSecondLayerCardEntry(String id, String title, String str, PredefinedUIToggleSettings predefinedUIToggleSettings, PredefinedTVSecondLayerSettingsContent content) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = id;
        this.title = title;
        this.description = str;
        this.toggle = predefinedUIToggleSettings;
        this.content = content;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final PredefinedUIToggleSettings getToggle() {
        return this.toggle;
    }

    public final PredefinedTVSecondLayerSettingsContent getContent() {
        return this.content;
    }
}
