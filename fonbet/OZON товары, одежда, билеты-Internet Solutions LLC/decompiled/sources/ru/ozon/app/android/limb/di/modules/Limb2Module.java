package ru.ozon.app.android.limb.di.modules;

import Ld0.c;
import Ld0.d;
import Ld0.e;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/limb/di/modules/Limb2Module;", "", "Companion", "limb_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Limb2Module {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/limb/di/modules/Limb2Module$Companion;", "", "<init>", "()V", "LLd0/d;", "globalLibsConfig", "", "LOd0/d;", "LLd0/e;", "pluginProviders", "LLd0/c;", "provideOzonLimbDiStore", "(LLd0/d;Ljava/util/Set;)LLd0/c;", "limb_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c provideOzonLimbDiStore(@NotNull d globalLibsConfig, @NotNull Set<Od0.d<e>> pluginProviders) {
            Intrinsics.checkNotNullParameter(globalLibsConfig, "globalLibsConfig");
            Intrinsics.checkNotNullParameter(pluginProviders, "pluginProviders");
            c.a aVar = new c.a(globalLibsConfig);
            Iterator<T> it = pluginProviders.iterator();
            while (it.hasNext()) {
                aVar.b((Od0.d) it.next());
            }
            return aVar.a();
        }

        private Companion() {
        }
    }
}
