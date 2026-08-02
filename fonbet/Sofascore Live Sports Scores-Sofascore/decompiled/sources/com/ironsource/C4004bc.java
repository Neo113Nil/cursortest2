package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.bc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4004bc extends C4100h0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4004bc(@NotNull UUID uuid, @NotNull String str, @Nullable C4077fd c4077fd) {
        super(IronSource.a.NATIVE_AD, uuid, str, c4077fd, null, null, 48, null);
        uuid.getClass();
        str.getClass();
    }

    public /* synthetic */ C4004bc(UUID uuid, String str, C4077fd c4077fd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : c4077fd);
    }

    public C4004bc() {
        this(C4303s7.a.a(), "", null, 4, null);
    }
}
