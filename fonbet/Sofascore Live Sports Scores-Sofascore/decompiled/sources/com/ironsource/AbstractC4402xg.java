package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.xg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4402xg {
    public /* synthetic */ AbstractC4402xg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4402xg() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.xg$a */
    public static final class a extends AbstractC4402xg {

        @NotNull
        private final LevelPlay.AdFormat a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull LevelPlay.AdFormat adFormat) {
            super(null);
            adFormat.getClass();
            this.a = adFormat;
        }

        public static /* synthetic */ a a(a aVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = aVar.a;
            }
            return aVar.a(adFormat);
        }

        @NotNull
        public final LevelPlay.AdFormat b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "EmptyPlacementsArray(adFormat=" + this.a + ")";
        }

        @NotNull
        public final a a(@NotNull LevelPlay.AdFormat adFormat) {
            adFormat.getClass();
            return new a(adFormat);
        }

        @NotNull
        public final LevelPlay.AdFormat a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.xg$b */
    public static final class b extends AbstractC4402xg {

        @NotNull
        private final LevelPlay.AdFormat a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull LevelPlay.AdFormat adFormat) {
            super(null);
            adFormat.getClass();
            this.a = adFormat;
        }

        public static /* synthetic */ b a(b bVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = bVar.a;
            }
            return bVar.a(adFormat);
        }

        @NotNull
        public final LevelPlay.AdFormat b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "MissingPlacements(adFormat=" + this.a + ")";
        }

        @NotNull
        public final b a(@NotNull LevelPlay.AdFormat adFormat) {
            adFormat.getClass();
            return new b(adFormat);
        }

        @NotNull
        public final LevelPlay.AdFormat a() {
            return this.a;
        }
    }
}
