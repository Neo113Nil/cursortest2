package ru.ozon.fintech.features.camera.domain;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/fintech/features/camera/domain/OpenPickerAction;", "", "intent", "Landroid/content/Intent;", "requestCode", "", "<init>", "(Landroid/content/Intent;I)V", "getIntent", "()Landroid/content/Intent;", "getRequestCode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OpenPickerAction {

    @NotNull
    private final Intent intent;
    private final int requestCode;

    public OpenPickerAction(@NotNull Intent intent, int i11) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.intent = intent;
        this.requestCode = i11;
    }

    public static /* synthetic */ OpenPickerAction copy$default(OpenPickerAction openPickerAction, Intent intent, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            intent = openPickerAction.intent;
        }
        if ((i12 & 2) != 0) {
            i11 = openPickerAction.requestCode;
        }
        return openPickerAction.copy(intent, i11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Intent getIntent() {
        return this.intent;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRequestCode() {
        return this.requestCode;
    }

    @NotNull
    public final OpenPickerAction copy(@NotNull Intent intent, int requestCode) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new OpenPickerAction(intent, requestCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPickerAction)) {
            return false;
        }
        OpenPickerAction openPickerAction = (OpenPickerAction) other;
        return Intrinsics.d(this.intent, openPickerAction.intent) && this.requestCode == openPickerAction.requestCode;
    }

    @NotNull
    public final Intent getIntent() {
        return this.intent;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public int hashCode() {
        return Integer.hashCode(this.requestCode) + (this.intent.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "OpenPickerAction(intent=" + this.intent + ", requestCode=" + this.requestCode + ")";
    }
}
