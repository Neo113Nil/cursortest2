package com.unity3d.ads;

import com.ironsource.C4259pg;
import com.ironsource.Nf;
import defpackage.me4;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/MediationInfo;", "", "name", "", "version", Nf.b, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", C4259pg.b, "()Ljava/lang/String;", "getAdapterVersion", "getName", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediationInfo {

    @NotNull
    private final String adapterVersion;

    @NotNull
    private final String name;

    @NotNull
    private final String version;

    public MediationInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        me4.p(str, str2, str3);
        this.version = str2;
        this.adapterVersion = str3;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.name = lowerCase;
    }

    @NotNull
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }
}
