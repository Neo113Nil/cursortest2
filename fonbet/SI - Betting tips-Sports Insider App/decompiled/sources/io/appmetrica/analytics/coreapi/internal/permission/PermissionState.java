package io.appmetrica.analytics.coreapi.internal.permission;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class PermissionState {
    public final boolean granted;

    @NonNull
    public final String name;

    public PermissionState(@NonNull String str, boolean z5) {
        this.name = str;
        this.granted = z5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionState permissionState = (PermissionState) obj;
        if (this.granted != permissionState.granted) {
            return false;
        }
        return this.name.equals(permissionState.name);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + (this.granted ? 1 : 0);
    }

    public String toString() {
        return "PermissionState{name='" + this.name + "', granted=" + this.granted + '}';
    }
}
