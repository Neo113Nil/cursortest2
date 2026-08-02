package com.vk.push.core.remote.config.omicron;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface OmicronEnvironment {
    public static final OmicronEnvironment DEV = new a();
    public static final OmicronEnvironment ALPHA = new b();
    public static final OmicronEnvironment BETA = new c();
    public static final OmicronEnvironment RELEASE = new d();

    public class a implements OmicronEnvironment {
        @Override // com.vk.push.core.remote.config.omicron.OmicronEnvironment
        @NonNull
        public final String name() {
            return "DEV";
        }
    }

    public class b implements OmicronEnvironment {
        @Override // com.vk.push.core.remote.config.omicron.OmicronEnvironment
        @NonNull
        public final String name() {
            return "ALPHA";
        }
    }

    public class c implements OmicronEnvironment {
        @Override // com.vk.push.core.remote.config.omicron.OmicronEnvironment
        @NonNull
        public final String name() {
            return "BETA";
        }
    }

    public class d implements OmicronEnvironment {
        @Override // com.vk.push.core.remote.config.omicron.OmicronEnvironment
        @NonNull
        public final String name() {
            return "RELEASE";
        }
    }

    @NonNull
    String name();
}
