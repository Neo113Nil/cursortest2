package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.fo8;

/* loaded from: classes13.dex */
public interface q {

    public static final class a {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        public final IronSourceError a(h hVar) {
            h.b bVar = (h.b) hVar;
            if (bVar.f() == null) {
                return new IronSourceError(1060, fo8.a(this.a, " was initialized and loaded without Activity"));
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
            if ("CUSTOM" == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
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

    public static final class b {
        private final String a;

        public b(String str) {
            this.a = str;
        }

        public final IronSourceError a(h.d dVar) {
            if (dVar.d() == null) {
                return new IronSourceError(1060, fo8.a(this.a, " was initialized and loaded without Activity"));
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

    IronSourceError a();
}
