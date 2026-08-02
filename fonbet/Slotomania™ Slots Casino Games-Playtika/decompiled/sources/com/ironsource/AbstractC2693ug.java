package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ug, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC2693ug {

    /* renamed from: com.ironsource.ug$a */
    public static final class a extends AbstractC2693ug {
        private final LevelPlay.AdFormat a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LevelPlay.AdFormat adFormat) {
            super(null);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
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
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            return new a(adFormat);
        }

        public static /* synthetic */ a a(a aVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = aVar.a;
            }
            return aVar.a(adFormat);
        }
    }

    /* renamed from: com.ironsource.ug$b */
    public static final class b extends AbstractC2693ug {
        private final LevelPlay.AdFormat a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LevelPlay.AdFormat adFormat) {
            super(null);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
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
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            return new b(adFormat);
        }

        public static /* synthetic */ b a(b bVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = bVar.a;
            }
            return bVar.a(adFormat);
        }
    }

    public /* synthetic */ AbstractC2693ug(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC2693ug() {
    }
}
