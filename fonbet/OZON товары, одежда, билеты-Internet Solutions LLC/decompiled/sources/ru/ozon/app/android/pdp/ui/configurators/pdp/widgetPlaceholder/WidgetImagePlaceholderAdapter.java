package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder;

import Ae.C2399j;
import Ae.C2408n0;
import Ge.n;
import He.b;
import Nk.a;
import a00.C4908c;
import a00.C4911f;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.D;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.I;
import androidx.lifecycle.K;
import bd.h;
import io.reactivex.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.flags.PdpWidgetImagePlaceholderFlag;
import ru.ozon.app.android.pdp.ui.configurators.R$dimen;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import xe.C10720e0;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018JG\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\r2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0010¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010+2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020!2\u0006\u0010.\u001a\u00020\rH\u0082@¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020!2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020!2\u0006\u00105\u001a\u00020\rH\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0010H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0010H\u0002¢\u0006\u0004\b<\u00109J'\u0010=\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b=\u0010>J(\u0010?\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020!2\u0006\u0010B\u001a\u00020A2\u0006\u00105\u001a\u00020\rH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020!H\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010HR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010IR\u001e\u0010L\u001a\n\u0018\u00010Jj\u0004\u0018\u0001`K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u00102\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010NR\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010OR\u0016\u0010P\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR.\u0010R\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00160+0Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR.\u0010T\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00160+0Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010SR\"\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010SR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020V0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010SR\u0014\u0010X\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010OR&\u0010[\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0Y0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010SR\"\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00100Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010SR\u0016\u0010^\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010l\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010OR\u0016\u0010o\u001a\u0004\u0018\u00010f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0016\u0010r\u001a\u0004\u0018\u00010i8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "favoriteInteractor", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "key", "state", "", "isOriginalWidget", "canMapPlaceholderWidget", "(Ljava/lang/String;Ljava/lang/Object;Z)Z", "widgetId", "stateId", "Landroid/graphics/Bitmap;", "getImage", "(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;", "Landroid/view/View;", "view", "widgetName", "Ljk0/q;", "info", "json", "Lkotlin/Function0;", "predicate", "", "cacheViewIfNeeded", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljk0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "ref", "initNewPage", "(Lru/ozon/app/android/composer/ConfiguratorReferences;)V", "isFavorite", "setFavoriteState", "(Z)V", "", "getBitmapWithCurrentTheme", "(Ljava/lang/String;)Ljava/util/Map;", "fullWidgetId", "saveWidget", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "sku", "setupObservers", "(J)V", "folderSku", "prepareWidgets", "(Ljava/lang/String;)V", "currentInCartState", "()Z", "getBitmapFromView", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "canCache", "saveJson", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "saveBitmap", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "removeDirectoryAndFiles", "(Landroid/content/Context;Ljava/lang/String;)V", "removeFilesIfNeeded", "()V", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "La00/f;", "Ljava/lang/String;", "Z", "isInCart", "", "bitmapImages", "Ljava/util/Map;", "darkBitmapImages", "prepareIds", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/PrepareView;", "prepareViews", "isEnabledWidgetPlaceholders", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BasePlaceholderWidgetObject;", "oldWidgetsObject", "mapState", "Lxe/J;", "exceptionHandler", "Lxe/J;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isWidgetsPrepared", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/lifecycle/I;", "lifecycleObserver", "Landroidx/lifecycle/I;", "", "lastTextSizeSP", "Ljava/lang/Float;", "", "lastWindowWidth", "Ljava/lang/Integer;", "isinitialize", "getTextSizeSP", "()Ljava/lang/Float;", "textSizeSP", "getWindowWidth", "()Ljava/lang/Integer;", "windowWidth", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WidgetImagePlaceholderAdapter {

    @NotNull
    private Map<String, Map<String, Bitmap>> bitmapImages;

    @NotNull
    private final CartService cartService;

    @NotNull
    private Map<String, Map<String, Bitmap>> darkBitmapImages;

    @NotNull
    private J exceptionHandler;

    @NotNull
    private final FavoriteInteractor favoriteInteractor;
    private final boolean isEnabledWidgetPlaceholders;
    private boolean isFavorite;
    private boolean isInCart;

    @NotNull
    private final AtomicBoolean isWidgetsPrepared;
    private boolean isinitialize;

    @NotNull
    private final JsonParser jsonDeserializer;
    private Float lastTextSizeSP;
    private Integer lastWindowWidth;

    @NotNull
    private I lifecycleObserver;

    @NotNull
    private final Map<String, Boolean> mapState;

    @NotNull
    private final Map<String, List<BasePlaceholderWidgetObject>> oldWidgetsObject;
    private C4911f ownerContainer;

    @NotNull
    private Map<String, Boolean> prepareIds;

    @NotNull
    private final Map<String, PrepareView> prepareViews;
    private String sku;

    public WidgetImagePlaceholderAdapter(@NotNull CartService cartService, @NotNull FavoriteInteractor favoriteInteractor, @NotNull JsonParser jsonDeserializer, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(favoriteInteractor, "favoriteInteractor");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.cartService = cartService;
        this.favoriteInteractor = favoriteInteractor;
        this.jsonDeserializer = jsonDeserializer;
        this.bitmapImages = new LinkedHashMap();
        this.darkBitmapImages = new LinkedHashMap();
        this.prepareIds = new LinkedHashMap();
        this.prepareViews = new LinkedHashMap();
        this.isEnabledWidgetPlaceholders = featureChecker.isEnabled(PdpWidgetImagePlaceholderFlag.INSTANCE);
        this.oldWidgetsObject = new LinkedHashMap();
        this.mapState = new LinkedHashMap();
        this.exceptionHandler = new WidgetImagePlaceholderAdapter$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.isWidgetsPrepared = new AtomicBoolean(false);
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(androidx.lifecycle.J owner) {
                Map map;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onDestroy(owner);
                map = WidgetImagePlaceholderAdapter.this.prepareViews;
                map.clear();
                WidgetImagePlaceholderAdapter.this.removeFilesIfNeeded();
            }
        };
    }

    public static /* synthetic */ void cacheViewIfNeeded$default(WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, View view, String str, String str2, q qVar, String str3, Function0 function0, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            function0 = null;
        }
        widgetImagePlaceholderAdapter.cacheViewIfNeeded(view, str, str2, qVar, str3, function0);
    }

    private final boolean canCache() {
        return this.isInCart || this.isFavorite;
    }

    public static /* synthetic */ boolean canMapPlaceholderWidget$default(WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, String str, Object obj, boolean z11, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return widgetImagePlaceholderAdapter.canMapPlaceholderWidget(str, obj, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean currentInCartState() {
        Map<Long, CartItemInfo> items = this.cartService.getCartState().getItems();
        String str = this.sku;
        return (str == null || items.get(Long.valueOf(Long.parseLong(str))) == null) ? false : true;
    }

    private final Bitmap getBitmapFromView(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private final Map<String, Bitmap> getBitmapWithCurrentTheme(String key) {
        r a11;
        C4911f c4911f = this.ownerContainer;
        return Intrinsics.d((c4911f == null || (a11 = c4911f.a()) == null) ? null : Boolean.valueOf(ThemeExtKt.isDarkThemeActive(a11)), Boolean.TRUE) ? this.darkBitmapImages.get(key) : this.bitmapImages.get(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Float getTextSizeSP() {
        r a11;
        Context applicationContext;
        Resources resources;
        C4911f c4911f = this.ownerContainer;
        if (c4911f == null || (a11 = c4911f.a()) == null || (applicationContext = a11.getApplicationContext()) == null || (resources = applicationContext.getResources()) == null) {
            return null;
        }
        return Float.valueOf(resources.getDimension(R$dimen.widget_placeholder_sp));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getWindowWidth() {
        r a11;
        Context applicationContext;
        Resources resources;
        DisplayMetrics displayMetrics;
        C4911f c4911f = this.ownerContainer;
        if (c4911f == null || (a11 = c4911f.a()) == null || (applicationContext = a11.getApplicationContext()) == null || (resources = applicationContext.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return null;
        }
        return Integer.valueOf(displayMetrics.widthPixels);
    }

    private final void prepareWidgets(String folderSku) {
        r a11;
        Context applicationContext;
        C4911f c4911f;
        C4908c g10;
        C4911f c4911f2 = this.ownerContainer;
        if (c4911f2 == null || (a11 = c4911f2.a()) == null || (applicationContext = a11.getApplicationContext()) == null || (c4911f = this.ownerContainer) == null || (g10 = c4911f.g()) == null) {
            return;
        }
        D a12 = K.a(g10);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a12, b.f10879b.plus(this.exceptionHandler), null, new WidgetImagePlaceholderAdapter$prepareWidgets$1(this, applicationContext, folderSku, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeDirectoryAndFiles(Context context, String folderSku) {
        File file = new File(context.getFilesDir(), a.b("PdpWidgetJsonStorage/", folderSku));
        File file2 = new File(context.getFilesDir(), a.b("PdpWidgetBitmapStorage/", folderSku));
        h.h(file);
        h.h(file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeFilesIfNeeded() {
        r a11;
        Context applicationContext;
        C4911f c4911f;
        r a12;
        C4911f c4911f2 = this.ownerContainer;
        if (c4911f2 == null || (a11 = c4911f2.a()) == null || (applicationContext = a11.getApplicationContext()) == null || (c4911f = this.ownerContainer) == null || (a12 = c4911f.a()) == null) {
            return;
        }
        D a13 = K.a(a12);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a13, b.f10879b.plus(this.exceptionHandler), null, new WidgetImagePlaceholderAdapter$removeFilesIfNeeded$1(this, applicationContext, null), 2);
    }

    private final Object saveBitmap(String str, String str2, View view, d<? super Unit> dVar) {
        r a11;
        Context applicationContext;
        C4911f c4911f = this.ownerContainer;
        if (c4911f == null || (a11 = c4911f.a()) == null || (applicationContext = a11.getApplicationContext()) == null) {
            return Unit.f71690a;
        }
        String str3 = this.sku;
        if (str3 == null) {
            return Unit.f71690a;
        }
        Pair pair = new Pair(applicationContext, str3);
        File file = new File(((Context) pair.a()).getFilesDir(), Sh.b.c("PdpWidgetBitmapStorage/", (String) pair.b(), "/", str));
        if (!file.exists()) {
            file.mkdirs();
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ThemeExtKt.isDarkThemeActive(context)) {
            str2 = U7.d.e(str2, "-dark");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str2));
        getBitmapFromView(view).compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.close();
        return Unit.f71690a;
    }

    private final void saveJson(String widgetName, String json, String widgetId) {
        r a11;
        Context applicationContext;
        String str;
        C4911f c4911f = this.ownerContainer;
        if (c4911f == null || (a11 = c4911f.a()) == null || (applicationContext = a11.getApplicationContext()) == null || (str = this.sku) == null) {
            return;
        }
        Pair pair = new Pair(applicationContext, str);
        File file = new File(((Context) pair.a()).getFilesDir(), Sh.b.c("PdpWidgetJsonStorage/", (String) pair.b(), "/", widgetName));
        if (!file.exists()) {
            file.mkdirs();
        }
        FileWriter fileWriter = new FileWriter(new File(file, widgetId + "-" + getTextSizeSP() + "-" + getWindowWidth()));
        fileWriter.append((CharSequence) json);
        fileWriter.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveWidget(String str, d<? super Unit> dVar) {
        PrepareView prepareView = this.prepareViews.get(str);
        if (prepareView != null) {
            String str2 = (String) C7714v.Q(1, kotlin.text.h.m(prepareView.getStateId(), new String[]{"-"}, 0, 6));
            if (str2 == null) {
                return Unit.f71690a;
            }
            saveJson(prepareView.getWidgetName(), prepareView.getJson(), str2);
            Object saveBitmap = saveBitmap(prepareView.getWidgetName(), str2, prepareView.getView(), dVar);
            if (saveBitmap == Wc.a.COROUTINE_SUSPENDED) {
                return saveBitmap;
            }
        }
        return Unit.f71690a;
    }

    private final void setupObservers(long sku) {
        C4908c g10;
        C4908c g11;
        AbstractC5434v lifecycle;
        C4911f c4911f = this.ownerContainer;
        if (c4911f == null || (g10 = c4911f.g()) == null) {
            return;
        }
        D a11 = K.a(g10);
        C4911f c4911f2 = this.ownerContainer;
        if (c4911f2 != null && (g11 = c4911f2.g()) != null && (lifecycle = g11.getLifecycle()) != null) {
            lifecycle.a(this.lifecycleObserver);
        }
        C2399j.C(new C2408n0(n.a(CartService.DefaultImpls.observeCartState$default(this.cartService, false, 1, null)), new WidgetImagePlaceholderAdapter$setupObservers$1(this, null)), a11);
        p<FavoriteEvent> filter = this.favoriteInteractor.favoriteChangeEvents().filter(new GJ.a(new WidgetImagePlaceholderAdapter$setupObservers$2(sku), 10));
        Intrinsics.checkNotNullExpressionValue(filter, "filter(...)");
        C2399j.C(new C2408n0(n.a(filter), new WidgetImagePlaceholderAdapter$setupObservers$3(this, null)), a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupObservers$lambda$5(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    public final void cacheViewIfNeeded(@NotNull View view, @NotNull String widgetName, @NotNull String stateId, @NotNull q info, @NotNull String json, Function0<Boolean> predicate) {
        View view2;
        C4908c g10;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(json, "json");
        String str = widgetName + stateId;
        if (this.isEnabledWidgetPlaceholders) {
            Boolean bool = this.prepareIds.get(str);
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.d(bool, bool2) || !this.isinitialize) {
                return;
            }
            if (this.prepareViews.get(str) == null && o.a(view, info, false) == 1.0f) {
                view2 = view;
                this.prepareViews.put(str, new PrepareView(view2, info, json, widgetName, stateId));
            } else {
                view2 = view;
            }
            if (!canCache() || this.prepareViews.get(str) == null) {
                return;
            }
            if (predicate == null || predicate.invoke().booleanValue()) {
                this.prepareIds.put(str, bool2);
                C4911f c4911f = this.ownerContainer;
                if (c4911f == null || (g10 = c4911f.g()) == null) {
                    return;
                }
                D a11 = K.a(g10);
                C10720e0 c10720e0 = C10720e0.f105451a;
                C10727i.c(a11, b.f10879b.plus(this.exceptionHandler), null, new WidgetImagePlaceholderAdapter$cacheViewIfNeeded$1(view2, this, str, null), 2);
            }
        }
    }

    public final boolean canMapPlaceholderWidget(@NotNull String key, Object state, boolean isOriginalWidget) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.isEnabledWidgetPlaceholders && this.isWidgetsPrepared.get() && this.isinitialize) {
            Object obj = null;
            if (isOriginalWidget && this.mapState.get(key) != null) {
                this.mapState.put(key, null);
            }
            Boolean bool = this.mapState.get(key);
            if (bool != null) {
                return bool.booleanValue();
            }
            BasePlaceholderWidgetObject basePlaceholderWidgetObject = state instanceof BasePlaceholderWidgetObject ? (BasePlaceholderWidgetObject) state : null;
            if (basePlaceholderWidgetObject == null) {
                return false;
            }
            if (this.oldWidgetsObject.get(key) != null && getBitmapWithCurrentTheme(key) != null) {
                BasePlaceholderWidgetObject copyExcludingAnalytics = basePlaceholderWidgetObject.copyExcludingAnalytics();
                copyExcludingAnalytics.setJson(null);
                List<BasePlaceholderWidgetObject> list = this.oldWidgetsObject.get(key);
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        BasePlaceholderWidgetObject basePlaceholderWidgetObject2 = (BasePlaceholderWidgetObject) next;
                        if (basePlaceholderWidgetObject2.hashCode() == copyExcludingAnalytics.hashCode() && basePlaceholderWidgetObject2.equals(copyExcludingAnalytics)) {
                            obj = next;
                            break;
                        }
                    }
                    obj = (BasePlaceholderWidgetObject) obj;
                }
                if (obj != null) {
                    this.mapState.put(key, Boolean.TRUE);
                    return true;
                }
            }
            this.mapState.put(key, Boolean.FALSE);
        }
        return false;
    }

    public final Bitmap getImage(@NotNull String widgetId, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        String str = (String) kotlin.text.h.m(stateId, new String[]{"-"}, 0, 6).get(1);
        Map<String, Bitmap> bitmapWithCurrentTheme = getBitmapWithCurrentTheme(widgetId);
        if (bitmapWithCurrentTheme != null) {
            return bitmapWithCurrentTheme.get(str);
        }
        return null;
    }

    public final void initNewPage(@NotNull ConfiguratorReferences ref) {
        ComponentCallbacksC5392m c11;
        String tag;
        Uri parse;
        List<String> pathSegments;
        Intrinsics.checkNotNullParameter(ref, "ref");
        if (this.isEnabledWidgetPlaceholders) {
            C4911f ownerContainer = ref.getOwnerContainer();
            this.ownerContainer = ownerContainer;
            String str = (ownerContainer == null || (c11 = ownerContainer.c()) == null || (tag = c11.getTag()) == null || (parse = Uri.parse(tag)) == null || (pathSegments = parse.getPathSegments()) == null) ? null : (String) C7714v.K(pathSegments);
            this.sku = str;
            if (str == null || !StringExtKt.isDigital(str)) {
                return;
            }
            this.isinitialize = true;
            long parseLong = Long.parseLong(str);
            this.isInCart = currentInCartState();
            setupObservers(parseLong);
            prepareWidgets(str);
        }
    }

    public final void setFavoriteState(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }
}
