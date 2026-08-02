package com.vk.musc.kidsmode.api;

import androidx.compose.runtime.f;
import xsna.asp;
import xsna.gzs;
import xsna.s3q0;
import xsna.y7p;
import xsna.zrp;

/* compiled from: KidsModeRestrictionRenderer.kt */
/* loaded from: classes3.dex */
public interface KidsModeRestrictionRenderer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KidsModeRestrictionRenderer.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source ADULT_CONTENT;
        public static final Source KIDS_SETTINGS;
        public static final Source MUSIC_PROFILE;

        static {
            Source source = new Source("KIDS_SETTINGS", 0);
            KIDS_SETTINGS = source;
            Source source2 = new Source("MUSIC_PROFILE", 1);
            MUSIC_PROFILE = source2;
            Source source3 = new Source("ADULT_CONTENT", 2);
            ADULT_CONTENT = source3;
            Source[] sourceArr = {source, source2, source3};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        public Source() {
            throw null;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* compiled from: KidsModeRestrictionRenderer.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final KidsModeRestrictionRenderer STUB = new C1316a();

        /* compiled from: KidsModeRestrictionRenderer.kt */
        /* renamed from: com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer$a$a, reason: collision with other inner class name */
        public static final class C1316a implements KidsModeRestrictionRenderer {
            @Override // com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer
            public final void a(Source source, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
                aVar.K(-1225948113);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1225948113, i, -1, "com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer.Companion.STUB.<no name provided>.KidsModeRestriction (KidsModeRestrictionRenderer.kt:29)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }
        }

        public final KidsModeRestrictionRenderer getSTUB() {
            return STUB;
        }
    }

    /* compiled from: KidsModeRestrictionRenderer.kt */
    public static final class b {
        public static final void a(Source source, gzs gzsVar, gzs gzsVar2, KidsModeRestrictionRenderer kidsModeRestrictionRenderer, androidx.compose.runtime.a aVar, int i) {
            KidsModeRestrictionRenderer kidsModeRestrictionRenderer2;
            gzs gzsVar3;
            gzs gzsVar4;
            Source source2;
            androidx.compose.runtime.a M = aVar.M(-537309947);
            int i2 = (M.y(gzsVar) ? 32 : 16) | i | (M.y(gzsVar2) ? 256 : 128) | (M.J(kidsModeRestrictionRenderer) ? 2048 : 1024);
            if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-537309947, i2, -1, "com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer.ComposeDefaultImpls.KidsModeRestriction$default (KidsModeRestrictionRenderer.kt:-1)");
                }
                kidsModeRestrictionRenderer.a(source, gzsVar, gzsVar2, M, i2 & 8190);
                kidsModeRestrictionRenderer2 = kidsModeRestrictionRenderer;
                source2 = source;
                gzsVar4 = gzsVar;
                gzsVar3 = gzsVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                kidsModeRestrictionRenderer2 = kidsModeRestrictionRenderer;
                gzsVar3 = gzsVar2;
                gzsVar4 = gzsVar;
                source2 = source;
                M.h();
            }
            f s = M.s();
            if (s != null) {
                s.d = new y7p(source2, gzsVar4, gzsVar3, kidsModeRestrictionRenderer2, i);
            }
        }
    }

    void a(Source source, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i);
}
