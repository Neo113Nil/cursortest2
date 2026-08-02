package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import xsna.zcl;

/* loaded from: classes13.dex */
public abstract class Ag {

    public static final class a extends Ag {
        private final LevelPlay.AdFormat a;

        public a(LevelPlay.AdFormat adFormat) {
            super(null);
            this.a = adFormat;
        }

        public final LevelPlay.AdFormat a() {
            return this.a;
        }

        public final LevelPlay.AdFormat b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "EmptyPlacementsArray(adFormat=" + this.a + ")";
        }

        public final a a(LevelPlay.AdFormat adFormat) {
            return new a(adFormat);
        }

        public static /* synthetic */ a a(a aVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = aVar.a;
            }
            return aVar.a(adFormat);
        }
    }

    public static final class b extends Ag {
        private final LevelPlay.AdFormat a;

        public b(LevelPlay.AdFormat adFormat) {
            super(null);
            this.a = adFormat;
        }

        public final LevelPlay.AdFormat a() {
            return this.a;
        }

        public final LevelPlay.AdFormat b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "MissingPlacements(adFormat=" + this.a + ")";
        }

        public final b a(LevelPlay.AdFormat adFormat) {
            return new b(adFormat);
        }

        public static /* synthetic */ b a(b bVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = bVar.a;
            }
            return bVar.a(adFormat);
        }
    }

    public /* synthetic */ Ag(zcl zclVar) {
        this();
    }

    private Ag() {
    }
}
