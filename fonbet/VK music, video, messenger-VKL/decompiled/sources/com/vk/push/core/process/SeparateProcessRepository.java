package com.vk.push.core.process;

import android.content.Context;
import com.vk.push.core.domain.repository.MetadataRepository;
import com.vk.push.core.utils.ProcessUtilsKt;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.brm0;
import xsna.drm0;
import xsna.gzs;

/* compiled from: SeparateProcessRepository.kt */
/* loaded from: classes.dex */
public final class SeparateProcessRepository {
    public final Context a;
    public final MetadataRepository b;
    public final bpn0 c = new bpn0(new a());
    public final bpn0 d = new bpn0(new b());

    /* compiled from: SeparateProcessRepository.kt */
    public static final class a extends Lambda implements gzs<Boolean> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            String serviceProcessName = SeparateProcessRepository.this.b.getServiceProcessName();
            boolean z = false;
            if (serviceProcessName != null && brm0.v(serviceProcessName, ":vkpns", false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: SeparateProcessRepository.kt */
    public static final class b extends Lambda implements gzs<Boolean> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            String processName = ProcessUtilsKt.getProcessName(SeparateProcessRepository.this.a);
            boolean z = false;
            if (processName != null && drm0.D(processName, ":vkpns", false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public SeparateProcessRepository(Context context, MetadataRepository metadataRepository) {
        this.a = context;
        this.b = metadataRepository;
    }

    public final boolean isMultiProcessMode() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean isSeparateProcess() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }
}
