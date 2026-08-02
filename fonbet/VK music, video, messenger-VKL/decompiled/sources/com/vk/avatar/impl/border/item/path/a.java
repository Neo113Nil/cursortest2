package com.vk.avatar.impl.border.item.path;

import android.graphics.Path;
import com.vk.avatar.impl.border.item.path.VKAvatarBorderPathBuilder;

/* compiled from: VKAvatarBorderCirclePathBuilder.kt */
/* loaded from: classes15.dex */
public final class a extends VKAvatarBorderPathBuilder {
    @Override // com.vk.avatar.impl.border.item.path.VKAvatarBorderPathBuilder
    public final Path a(float f, float f2, float f3, VKAvatarBorderPathBuilder.PathPurpose pathPurpose) {
        Path path = new Path();
        path.addArc(f - f3, f2 - f3, f + f3, f2 + f3, 90.0f, -360.0f);
        return path;
    }
}
