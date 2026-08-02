package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.dmi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface q {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @NotNull
        private final String a;

        public a(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @Nullable
        public final IronSourceError a(@NotNull h hVar) {
            hVar.getClass();
            h.b bVar = (h.b) hVar;
            if (bVar.f() == null) {
                return new IronSourceError(1060, dmi.y(this.a, " was initialized and loaded without Activity"));
            }
            if (bVar.g() == null) {
                return new IronSourceError(510, "Missing banner layout");
            }
            if (bVar.g().isDestroyed()) {
                return new IronSourceError(510, "Banner layout is destroyed");
            }
            ISBannerSize size = bVar.g().getSize();
            if (size == null) {
                return new IronSourceError(510, "Missing banner size");
            }
            if (com.ironsource.mediationsdk.j.f == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String b = bVar.b();
            if ((b == null || b.length() == 0) && hVar.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {

        @NotNull
        private final String a;

        public b(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @Nullable
        public final IronSourceError a(@NotNull h.d dVar) {
            dVar.getClass();
            if (dVar.d() == null) {
                return new IronSourceError(1060, dmi.y(this.a, " was initialized and loaded without Activity"));
            }
            if (dVar.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String b = dVar.b();
            if ((b == null || b.length() == 0) && dVar.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    @Nullable
    IronSourceError a();
}
