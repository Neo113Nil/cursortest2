package com.vk.avatar.impl.border.item.path;

import android.graphics.Path;
import xsna.asp;
import xsna.zrp;

/* compiled from: VKAvatarBorderPathBuilder.kt */
/* loaded from: classes15.dex */
public abstract class VKAvatarBorderPathBuilder {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VKAvatarBorderPathBuilder.kt */
    public static final class PathPurpose {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PathPurpose[] $VALUES;
        public static final PathPurpose CROP_AVATAR;
        public static final PathPurpose DRAW_BORDER;

        static {
            PathPurpose pathPurpose = new PathPurpose("CROP_AVATAR", 0);
            CROP_AVATAR = pathPurpose;
            PathPurpose pathPurpose2 = new PathPurpose("DRAW_BORDER", 1);
            DRAW_BORDER = pathPurpose2;
            PathPurpose[] pathPurposeArr = {pathPurpose, pathPurpose2};
            $VALUES = pathPurposeArr;
            $ENTRIES = new asp(pathPurposeArr);
        }

        public PathPurpose() {
            throw null;
        }

        public static PathPurpose valueOf(String str) {
            return (PathPurpose) Enum.valueOf(PathPurpose.class, str);
        }

        public static PathPurpose[] values() {
            return (PathPurpose[]) $VALUES.clone();
        }
    }

    public abstract Path a(float f, float f2, float f3, PathPurpose pathPurpose);
}
