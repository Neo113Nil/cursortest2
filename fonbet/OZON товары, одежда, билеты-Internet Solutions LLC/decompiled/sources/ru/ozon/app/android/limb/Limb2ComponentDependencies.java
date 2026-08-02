package ru.ozon.app.android.limb;

import Ld0.d;
import Ld0.e;
import hi.InterfaceC6958a;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u001b\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/limb/Limb2ComponentDependencies;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "", "LOd0/d;", "LLd0/e;", "getPluginProviders", "()Ljava/util/Set;", "LLd0/d;", "getOzonLimbLibsGlobalConfig", "()LLd0/d;", "limb_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Limb2ComponentDependencies extends InterfaceC6958a {
    @NotNull
    d getOzonLimbLibsGlobalConfig();

    @NotNull
    Set<Od0.d<e>> getPluginProviders();
}
