package com.vk.id.internal.auth.web;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/vk/id/internal/auth/web/Browsers$Firefox", "", "<init>", "()V", "", "", "SIGNATURE_SET", "Ljava/util/Set;", "Lcom/vk/id/internal/auth/web/DelimitedVersion;", "MINIMUM_VERSION_FOR_CUSTOM_TAB", "Lcom/vk/id/internal/auth/web/DelimitedVersion;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Browsers$Firefox {

    @NotNull
    public static final Browsers$Firefox INSTANCE = new Browsers$Firefox();

    @NotNull
    public static final Set<String> SIGNATURE_SET = e0.h("2gCe6pR_AO_Q2Vu8Iep-4AsiKNnUHQxu0FaDHO_qa178GByKybdT_BuE8_dYk99G5Uvx_gdONXAOO2EaXidpVQ==");

    @NotNull
    public static final DelimitedVersion MINIMUM_VERSION_FOR_CUSTOM_TAB = DelimitedVersion.INSTANCE.parse("57");
    public static final int $stable = 8;

    private Browsers$Firefox() {
    }
}
