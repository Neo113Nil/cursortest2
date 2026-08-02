package ru.ozon.app.android.barcodecache.drawable;

import He.c;
import N9.b;
import Sc.s;
import Wc.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR0\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCacheImpl;", "Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;", "<init>", "()V", "", "code", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "getBarcodeDrawable", "(Ljava/lang/String;Landroid/content/Context;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "cache", "Ljava/util/HashMap;", "LN9/b;", "barcodeEncoder", "LN9/b;", "Companion", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeDrawableCacheImpl implements BarcodeDrawableCache {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float BARCODE_CORNER_RADIUS = UiExtKt.toPxF(8);

    @NotNull
    private final HashMap<String, Drawable> cache = new HashMap<>();

    @NotNull
    private final b barcodeEncoder = new b();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCacheImpl$Companion;", "", "<init>", "()V", "BARCODE_WIDTH", "", "BARCODE_HEIGHT", "BARCODE_CORNER_RADIUS", "", "getBARCODE_CORNER_RADIUS", "()F", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getBARCODE_CORNER_RADIUS() {
            return BarcodeDrawableCacheImpl.BARCODE_CORNER_RADIUS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.barcodecache.drawable.BarcodeDrawableCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getBarcodeDrawable(@NotNull String str, @NotNull Context context, @NotNull d<? super Drawable> dVar) {
        BarcodeDrawableCacheImpl$getBarcodeDrawable$1 barcodeDrawableCacheImpl$getBarcodeDrawable$1;
        int i11;
        BarcodeDrawableCacheImpl barcodeDrawableCacheImpl;
        if (dVar instanceof BarcodeDrawableCacheImpl$getBarcodeDrawable$1) {
            barcodeDrawableCacheImpl$getBarcodeDrawable$1 = (BarcodeDrawableCacheImpl$getBarcodeDrawable$1) dVar;
            int i12 = barcodeDrawableCacheImpl$getBarcodeDrawable$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                barcodeDrawableCacheImpl$getBarcodeDrawable$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = barcodeDrawableCacheImpl$getBarcodeDrawable$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = barcodeDrawableCacheImpl$getBarcodeDrawable$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    Drawable drawable = this.cache.get(str);
                    if (drawable != null) {
                        return drawable;
                    }
                    c a11 = C10720e0.a();
                    BarcodeDrawableCacheImpl$getBarcodeDrawable$drawable$1 barcodeDrawableCacheImpl$getBarcodeDrawable$drawable$1 = new BarcodeDrawableCacheImpl$getBarcodeDrawable$drawable$1(this, str, context, null);
                    barcodeDrawableCacheImpl$getBarcodeDrawable$1.L$0 = this;
                    barcodeDrawableCacheImpl$getBarcodeDrawable$1.L$1 = str;
                    barcodeDrawableCacheImpl$getBarcodeDrawable$1.label = 1;
                    obj = C10727i.f(a11, barcodeDrawableCacheImpl$getBarcodeDrawable$drawable$1, barcodeDrawableCacheImpl$getBarcodeDrawable$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    barcodeDrawableCacheImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) barcodeDrawableCacheImpl$getBarcodeDrawable$1.L$1;
                    barcodeDrawableCacheImpl = (BarcodeDrawableCacheImpl) barcodeDrawableCacheImpl$getBarcodeDrawable$1.L$0;
                    s.b(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                androidx.core.graphics.drawable.d dVar2 = (androidx.core.graphics.drawable.d) obj;
                barcodeDrawableCacheImpl.cache.put(str, dVar2);
                return dVar2;
            }
        }
        barcodeDrawableCacheImpl$getBarcodeDrawable$1 = new BarcodeDrawableCacheImpl$getBarcodeDrawable$1(this, dVar);
        Object obj2 = barcodeDrawableCacheImpl$getBarcodeDrawable$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = barcodeDrawableCacheImpl$getBarcodeDrawable$1.label;
        if (i11 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        androidx.core.graphics.drawable.d dVar22 = (androidx.core.graphics.drawable.d) obj2;
        barcodeDrawableCacheImpl.cache.put(str, dVar22);
        return dVar22;
    }
}
