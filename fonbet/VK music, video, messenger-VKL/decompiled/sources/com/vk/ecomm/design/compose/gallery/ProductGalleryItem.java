package com.vk.ecomm.design.compose.gallery;

import com.vk.dto.common.Image;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: ProductGalleryItem.kt */
/* loaded from: classes18.dex */
public final class ProductGalleryItem {
    public final Image a;
    public final Type b;
    public final a c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProductGalleryItem.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Photo;
        public static final Type Video;

        static {
            Type type = new Type("Photo", 0);
            Photo = type;
            Type type2 = new Type("Video", 1);
            Video = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: ProductGalleryItem.kt */
    public interface a {

        /* compiled from: ProductGalleryItem.kt */
        /* renamed from: com.vk.ecomm.design.compose.gallery.ProductGalleryItem$a$a, reason: collision with other inner class name */
        public static final class C0934a implements a {
            public static final C0934a a = new C0934a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0934a);
            }

            public final int hashCode() {
                return 444166827;
            }

            public final String toString() {
                return "Play";
            }
        }

        /* compiled from: ProductGalleryItem.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Restriction(message="), this.a, ')');
            }
        }
    }

    public ProductGalleryItem(Image image, Type type, a aVar) {
        this.a = image;
        this.b = type;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductGalleryItem)) {
            return false;
        }
        ProductGalleryItem productGalleryItem = (ProductGalleryItem) obj;
        return epx.f(this.a, productGalleryItem.a) && this.b == productGalleryItem.b && epx.f(this.c, productGalleryItem.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "ProductGalleryItem(image=" + this.a + ", type=" + this.b + ", overlay=" + this.c + ')';
    }
}
