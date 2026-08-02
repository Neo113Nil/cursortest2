package ru.ozon.app.android.utils;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0002¨\u0006\t"}, d2 = {"passedVersionIsLower", "", "", "passedVersion", "compareVersion", "Lru/ozon/app/android/utils/VersionModel;", "getVersionModel", "safetyCastToInt", "", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VersionModelKt {
    public static final boolean compareVersion(@NotNull VersionModel versionModel, @NotNull VersionModel passedVersion) {
        Intrinsics.checkNotNullParameter(versionModel, "<this>");
        Intrinsics.checkNotNullParameter(passedVersion, "passedVersion");
        return versionModel.getMajor() != passedVersion.getMajor() ? versionModel.getMajor() > passedVersion.getMajor() : versionModel.getMinor() != passedVersion.getMinor() ? versionModel.getMinor() > passedVersion.getMinor() : versionModel.getPatch() != passedVersion.getPatch() && versionModel.getPatch() > passedVersion.getPatch();
    }

    @NotNull
    public static final VersionModel getVersionModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        List m11 = h.m(h.z0(str).toString(), new String[]{"."}, 0, 6);
        if (m11.isEmpty()) {
            return new VersionModel(0, 0, 0, 7, null);
        }
        int size = m11.size();
        return size != 1 ? size != 2 ? new VersionModel(safetyCastToInt((String) m11.get(0)), safetyCastToInt((String) m11.get(1)), safetyCastToInt((String) m11.get(2))) : new VersionModel(safetyCastToInt((String) m11.get(0)), safetyCastToInt((String) m11.get(1)), 0, 4, null) : new VersionModel(safetyCastToInt((String) m11.get(0)), 0, 0, 6, null);
    }

    public static final boolean passedVersionIsLower(@NotNull String str, @NotNull String passedVersion) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(passedVersion, "passedVersion");
        VersionModel versionModel = getVersionModel(str);
        List m11 = h.m(passedVersion, new String[]{" "}, 0, 6);
        if (m11.isEmpty()) {
            m11 = null;
        }
        if (m11 == null || (str2 = (String) m11.get(0)) == null) {
            str2 = "";
        }
        return compareVersion(versionModel, getVersionModel(str2));
    }

    private static final int safetyCastToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }
}
