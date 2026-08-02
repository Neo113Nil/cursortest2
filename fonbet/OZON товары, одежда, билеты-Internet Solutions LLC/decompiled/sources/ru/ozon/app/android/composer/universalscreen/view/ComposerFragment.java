package ru.ozon.app.android.composer.universalscreen.view;

import A00.a;
import Cg0.d;
import NZ.k;
import Pc.a;
import QZ.g;
import S0.C3996z;
import S0.H0;
import S0.InterfaceC3967k;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.o;
import a00.C4911f;
import a00.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.M;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import b00.b;
import com.google.android.material.appbar.AppBarLayout;
import fk0.c;
import gi.C6739a;
import gi.C6740b;
import gk0.q;
import hi.InterfaceC6958a;
import i10.h;
import i10.k;
import j10.InterfaceC7238a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.f;
import l10.i;
import l20.C7854a;
import oZ.InterfaceC8677a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponent;
import ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies;
import ru.ozon.app.android.composer.universalscreen.di.DaggerComposerFragmentComponent;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.updates.ConfigurationChangedEvent;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.inapppush.InAppPushHost;
import ru.ozon.app.android.inapppush.util.ExtKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.PermissionRequester;
import ru.ozon.app.android.uikit.container.ExternalOffsetHandler;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.utils.CollectionExtKt;
import ru.ozon.app.android.utils.SoftInputChangeDelegate;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;

@Metadata(d1 = {"\u0000ú\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ä\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0006ä\u0001å\u0001æ\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0017¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\fH\u0016¢\u0006\u0004\b*\u0010\tJ\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010\tJ\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010\tJ\u000f\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010\tJ\u000f\u0010.\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010\tJ/\u00105\u001a\u00020\f2\u0006\u0010/\u001a\u00020#2\u000e\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u000201002\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J)\u0010:\u001a\u00020\f2\u0006\u0010/\u001a\u00020#2\u0006\u00107\u001a\u00020#2\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\f2\u0006\u0010<\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u0010\u0012J\u000f\u0010>\u001a\u00020\fH\u0016¢\u0006\u0004\b>\u0010\tJ\u0017\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010F\u001a\u00020\f2\u0006\u0010C\u001a\u0002012\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0011\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\n\u0018\u00010Kj\u0004\u0018\u0001`LH\u0016¢\u0006\u0004\bM\u0010NJ#\u0010R\u001a\u00020\f2\u0012\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\f0OH\u0016¢\u0006\u0004\bR\u0010SJ!\u0010V\u001a\u00020\f2\u0006\u0010C\u001a\u0002012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010T¢\u0006\u0004\bV\u0010WJ\u0015\u0010V\u001a\u00020\f2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bV\u0010ZJ)\u0010]\u001a\u00020\f2\u0006\u0010[\u001a\u0002012\b\b\u0002\u0010\\\u001a\u00020D2\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b]\u0010^J)\u0010a\u001a\u00020\f2\u0006\u0010_\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010`\u001a\u00020D¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH\u0002¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\fH\u0002¢\u0006\u0004\bf\u0010\tJ\u0019\u0010g\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\fH\u0002¢\u0006\u0004\bi\u0010\tR.\u0010l\u001a\b\u0012\u0004\u0012\u00020k0j8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bl\u0010m\u0012\u0004\br\u0010\t\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR(\u0010u\u001a\b\u0012\u0004\u0012\u00020t0s8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR$\u0010|\u001a\u00020{8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R-\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010j8\u0006@\u0006X\u0087.¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010m\u001a\u0005\b\u008b\u0001\u0010o\"\u0005\b\u008c\u0001\u0010qR0\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020H0\u008d\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R4\u0010\u0094\u0001\u001a\r\u0012\b\u0012\u00060Kj\u0002`L0\u008d\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u008f\u0001\u001a\u0006\b\u0095\u0001\u0010\u0091\u0001\"\u0006\b\u0096\u0001\u0010\u0093\u0001R*\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R!\u0010ª\u0001\u001a\u00030¥\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R!\u0010¯\u0001\u001a\u00030«\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¬\u0001\u0010§\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010±\u0001\u001a\u00030°\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R(\u0010d\u001a\u00030·\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bd\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R\u001c\u0010¾\u0001\u001a\u0005\u0018\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010À\u0001\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001b\u0010Â\u0001\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R!\u0010Ä\u0001\u001a\n\u0018\u00010Kj\u0004\u0018\u0001`L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0019\u0010Æ\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u001c\u0010É\u0001\u001a\u0005\u0018\u00010È\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u001c\u0010Ì\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ï\u0001\u001a\u00030Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u001d\u0010Õ\u0001\u001a\b0Ñ\u0001j\u0003`Ò\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u001d\u0010Ú\u0001\u001a\b0Ö\u0001j\u0003`×\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u001f\u0010ß\u0001\u001a\n\u0012\u0005\u0012\u00030Ü\u00010Û\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u0018\u0010ã\u0001\u001a\u00030à\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bá\u0001\u0010â\u0001¨\u0006ç\u0001"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "Landroidx/fragment/app/m;", "LoZ/a;", "LNZ/k;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Lru/ozon/app/android/permission/PermissionRequester;", "Lru/ozon/app/android/uikit/container/ExternalOffsetHandler;", "Lb00/b;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ll20/a;", "item", "Lkotlin/Function0;", "content", "ComposeWidgetWrapper", "(Ll20/a;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "", "offset", "setBottomOffset", "(I)V", "setMaxBottomOffset", "getMaxBottomOffset", "()I", "onResume", "onPause", "onStop", "onDestroyView", "onDetach", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "outState", "onSaveInstanceState", "scrollToTop", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "deeplink", "", "refresh", "onAnchorReturn", "(Ljava/lang/String;Z)V", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "Lkotlin/Function1;", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "buildPermissionRequest", "requestPermission", "(Lkotlin/jvm/functions/Function1;)V", "Li10/h$b;", "oneTimePostProcessing", "startLoading", "(Ljava/lang/String;Li10/h$b;)V", "Li10/h$c;", "pageRef", "(Li10/h$c;)V", "widgetComponent", "includeToolbarHeight", "scrollToWidget", "(Ljava/lang/String;ZI)V", "widgetKey", "smooth", "scrollToWidgetKey", "(IIZ)V", "Ll10/f$e;", "displayMode", "()Ll10/f$e;", "initScreenAnalytics", "receiveInAppPush", "(Landroid/view/ViewGroup;)V", "updateStatusBar", "", "Lru/ozon/app/android/composer/di/Widget;", "widgets", "Ljava/util/Set;", "getWidgets", "()Ljava/util/Set;", "setWidgets", "(Ljava/util/Set;)V", "getWidgets$annotations", "", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "configurators", "Ljava/util/List;", "getConfigurators", "()Ljava/util/List;", "setConfigurators", "(Ljava/util/List;)V", "LE00/a;", "errorStateFactory", "LE00/a;", "getErrorStateFactory", "()LE00/a;", "setErrorStateFactory", "(LE00/a;)V", "LC00/a;", "initialWidgetsProvider", "LC00/a;", "getInitialWidgetsProvider", "()LC00/a;", "setInitialWidgetsProvider", "(LC00/a;)V", "LQZ/g;", "interceptors", "getInterceptors", "setInterceptors", "LPc/a;", "atomPoolProvider", "LPc/a;", "getAtomPoolProvider", "()LPc/a;", "setAtomPoolProvider", "(LPc/a;)V", "viewPoolProvider", "getViewPoolProvider", "setViewPoolProvider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "setFeatureChecker", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerComposeThemeWrapper;", "themeWrapper", "Lru/ozon/app/android/composer/universalscreen/view/ComposerComposeThemeWrapper;", "getThemeWrapper", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerComposeThemeWrapper;", "setThemeWrapper", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerComposeThemeWrapper;)V", "Landroid/os/Handler;", "handler$delegate", "LSc/j;", "getHandler", "()Landroid/os/Handler;", "handler", "Lru/ozon/app/android/composer/ComposerFragmentController;", "fragmentController$delegate", "getFragmentController", "()Lru/ozon/app/android/composer/ComposerFragmentController;", "fragmentController", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "config", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "setConfig", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "getDisplayMode", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "setDisplayMode", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;)V", "Lru/ozon/app/android/utils/SoftInputChangeDelegate;", "softInputInputChangeDelegate", "Lru/ozon/app/android/utils/SoftInputChangeDelegate;", "permissionRequestBuilder", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "atomPool", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "prefetchViewPool", "Lfk0/c;", "isFirstLoaded", "Z", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$Host;", "host", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$Host;", "Ll10/i;", "composerScreenUiContainer", "Ll10/i;", "Ljava/lang/Runnable;", "loading", "Ljava/lang/Runnable;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "getOwnerContainer", "()La00/f;", "ownerContainer", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "getViewModelOwnerProvider", "()La00/h;", "viewModelOwnerProvider", "Lj10/a;", "Lru/ozon/composer/ui/widget/l;", "getComposerStore", "()Lj10/a;", "composerStore", "Ll10/b;", "getController", "()Ll10/b;", "controller", "Companion", "DisplayMode", "Host", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"LifecycleMethodsOrder"})
/* loaded from: classes6.dex */
public final class ComposerFragment extends ComponentCallbacksC5392m implements InterfaceC8677a, k, CacheHolder, PermissionRequester, ExternalOffsetHandler, b {
    private RecycledAtomPool atomPool;
    public a<RecycledAtomPool> atomPoolProvider;
    private i composerScreenUiContainer;
    public ComposerScreenConfig config;
    public List<ComposerScreenConfig.PageConfigurator> configurators;
    public DisplayMode displayMode;
    public E00.a errorStateFactory;
    public FeatureChecker featureChecker;
    private Host host;
    public C00.a initialWidgetsProvider;
    public Set<g> interceptors;
    private boolean isFirstLoaded;
    private PermissionRequest.Builder permissionRequestBuilder;
    private c prefetchViewPool;
    private SoftInputChangeDelegate softInputInputChangeDelegate;
    public ComposerComposeThemeWrapper themeWrapper;
    public a<c> viewPoolProvider;
    public Set<Widget> widgets;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handler = Sc.k.b(ComposerFragment$handler$2.INSTANCE);

    /* renamed from: fragmentController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fragmentController = Sc.k.b(new ComposerFragment$fragmentController$2(this));

    @NotNull
    private final Runnable loading = new Runnable() { // from class: Mr.f
        @Override // java.lang.Runnable
        public final void run() {
            ComposerFragment.loading$lambda$0(ComposerFragment.this);
        }
    };

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$Companion;", "", "<init>", "()V", "ARG_DISPLAY_MODE", "", "newInstance", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "config", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "displayMode", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "additionalArgs", "Landroid/os/Bundle;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ComposerFragment newInstance$default(Companion companion, ComposerScreenConfig composerScreenConfig, DisplayMode displayMode, Bundle bundle, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                displayMode = null;
            }
            if ((i11 & 4) != 0) {
                bundle = null;
            }
            return companion.newInstance(composerScreenConfig, displayMode, bundle);
        }

        @NotNull
        public final ComposerFragment newInstance(@NotNull ComposerScreenConfig config, DisplayMode displayMode, Bundle additionalArgs) {
            Intrinsics.checkNotNullParameter(config, "config");
            ComposerFragment composerFragment = new ComposerFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_COMPOSER_SCREEN_CONFIG", config);
            bundle.putSerializable("ARG_DISPLAY_MODE", displayMode);
            if (additionalArgs != null) {
                bundle.putAll(additionalArgs);
            }
            composerFragment.setArguments(bundle);
            return composerFragment;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "BOTTOM_SHEET_WRAP", "BOTTOM_SHEET_FULL", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DisplayMode {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ DisplayMode[] $VALUES;
        public static final DisplayMode REGULAR = new DisplayMode("REGULAR", 0);
        public static final DisplayMode BOTTOM_SHEET_WRAP = new DisplayMode("BOTTOM_SHEET_WRAP", 1);
        public static final DisplayMode BOTTOM_SHEET_FULL = new DisplayMode("BOTTOM_SHEET_FULL", 2);

        private static final /* synthetic */ DisplayMode[] $values() {
            return new DisplayMode[]{REGULAR, BOTTOM_SHEET_WRAP, BOTTOM_SHEET_FULL};
        }

        static {
            DisplayMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private DisplayMode(String str, int i11) {
        }

        public static DisplayMode valueOf(String str) {
            return (DisplayMode) Enum.valueOf(DisplayMode.class, str);
        }

        public static DisplayMode[] values() {
            return (DisplayMode[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$Host;", "", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/composer/ComposerFragmentController;", "composer", "", "onComposerCreated", "(Landroidx/fragment/app/m;Lru/ozon/app/android/composer/ComposerFragmentController;)V", "Ll10/i;", "composerContainer", "(Landroidx/fragment/app/m;Lru/ozon/app/android/composer/ComposerFragmentController;Ll10/i;)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Host {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class DefaultImpls {
            @InterfaceC3999a
            public static void onComposerCreated(@NotNull Host host, @NotNull ComponentCallbacksC5392m fragment, @NotNull ComposerFragmentController composer) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(composer, "composer");
            }

            public static void onComposerCreated(@NotNull Host host, @NotNull ComponentCallbacksC5392m fragment, @NotNull ComposerFragmentController composer, i iVar) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(composer, "composer");
                host.onComposerCreated(fragment, composer);
            }
        }

        @InterfaceC3999a
        void onComposerCreated(@NotNull ComponentCallbacksC5392m fragment, @NotNull ComposerFragmentController composer);

        void onComposerCreated(@NotNull ComponentCallbacksC5392m fragment, @NotNull ComposerFragmentController composer, i composerContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.e displayMode() {
        int ordinal = getDisplayMode().ordinal();
        return ordinal == DisplayMode.BOTTOM_SHEET_FULL.ordinal() ? f.e.BOTTOM_SHEET_FULL : ordinal == DisplayMode.BOTTOM_SHEET_WRAP.ordinal() ? f.e.BOTTOM_SHEET_WRAP : f.e.REGULAR;
    }

    private final InterfaceC7238a<l> getComposerStore() {
        return getFragmentController().getComposerStore();
    }

    private final InterfaceC7851b getController() {
        return getFragmentController().getController();
    }

    private final ComposerFragmentController getFragmentController() {
        return (ComposerFragmentController) this.fragmentController.getValue();
    }

    private final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    private final C4911f getOwnerContainer() {
        return getFragmentController().getOwnerContainer();
    }

    private final h getViewModelOwnerProvider() {
        return getFragmentController().getViewModelOwnerProvider();
    }

    private final void initScreenAnalytics() {
        Sg.b.a(getFragmentController().getAnalyticsScreenStorage(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loading$lambda$0(ComposerFragment composerFragment) {
        if (composerFragment.isAdded() && !composerFragment.isFirstLoaded) {
            composerFragment.isFirstLoaded = true;
            composerFragment.getFragmentController().getPagePerformanceTracker().d(System.nanoTime());
            composerFragment.getComposerStore().c(a.u.C0013a.f242a);
        }
    }

    private final void receiveInAppPush(ViewGroup container) {
        InAppPushHost inAppPushHost;
        if (!(container instanceof FrameLayout) || (inAppPushHost = ExtKt.getInAppPushHost(this)) == null) {
            return;
        }
        InAppPushHost.DefaultImpls.receiveInAppPush$default(inAppPushHost, getConfig().getPageRef(), this, (FrameLayout) container, (Long) null, 8, (Object) null);
    }

    public static /* synthetic */ void scrollToWidget$default(ComposerFragment composerFragment, String str, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        composerFragment.scrollToWidget(str, z11, i11);
    }

    public static /* synthetic */ void scrollToWidgetKey$default(ComposerFragment composerFragment, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        composerFragment.scrollToWidgetKey(i11, i12, z11);
    }

    public static /* synthetic */ void startLoading$default(ComposerFragment composerFragment, String str, h.b bVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bVar = null;
        }
        composerFragment.startLoading(str, bVar);
    }

    private final void updateStatusBar() {
        Integer statusBarSemanticColor;
        if (getDisplayMode() == DisplayMode.BOTTOM_SHEET_FULL || getDisplayMode() == DisplayMode.BOTTOM_SHEET_WRAP) {
            return;
        }
        if (getConfig().getUseSemanticStatusBarColor()) {
            M requireActivity = requireActivity();
            ComposerThemeProvider composerThemeProvider = requireActivity instanceof ComposerThemeProvider ? (ComposerThemeProvider) requireActivity : null;
            StatusBarController.INSTANCE.setStatusBarColorByTheme(this, StatusBarController.UpdateReason.NewState.INSTANCE, (composerThemeProvider == null || (statusBarSemanticColor = composerThemeProvider.getStatusBarSemanticColor()) == null) ? R$attr.layerFloor1 : statusBarSemanticColor.intValue());
        }
        Window window = requireActivity().getWindow();
        if (window != null) {
            StatusBarController.INSTANCE.setFullScreenWindow(window, true);
        }
    }

    @Override // b00.b
    public void ComposeWidgetWrapper(@NotNull C7854a item, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(content, "content");
        interfaceC3967k.o(-2028727627);
        WZ.l lVar = (WZ.l) interfaceC3967k.m(b00.f.e());
        interfaceC3967k.o(1907813994);
        boolean F11 = interfaceC3967k.F(item) | interfaceC3967k.F(lVar);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new ComposerFragment$ComposeWidgetWrapper$dsViewAnalyticsHandler$1$1(item, lVar);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        C3996z.b(new H0[]{d.a().c(new Cg0.c(item.c().c().i())), AnalyticsModifierKt.getLocalDSViewAnalyticsProvider().c((Function1) C11)}, a1.c.c(-1641675275, new ComposerFragment$ComposeWidgetWrapper$1(this, content), interfaceC3967k), interfaceC3967k, 56);
        interfaceC3967k.k();
    }

    @NotNull
    public final Pc.a<RecycledAtomPool> getAtomPoolProvider() {
        Pc.a<RecycledAtomPool> aVar = this.atomPoolProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("atomPoolProvider");
        throw null;
    }

    @NotNull
    public final ComposerScreenConfig getConfig() {
        ComposerScreenConfig composerScreenConfig = this.config;
        if (composerScreenConfig != null) {
            return composerScreenConfig;
        }
        Intrinsics.n("config");
        throw null;
    }

    @NotNull
    public final List<ComposerScreenConfig.PageConfigurator> getConfigurators() {
        List<ComposerScreenConfig.PageConfigurator> list = this.configurators;
        if (list != null) {
            return list;
        }
        Intrinsics.n("configurators");
        throw null;
    }

    @NotNull
    public final DisplayMode getDisplayMode() {
        DisplayMode displayMode = this.displayMode;
        if (displayMode != null) {
            return displayMode;
        }
        Intrinsics.n("displayMode");
        throw null;
    }

    @NotNull
    public final E00.a getErrorStateFactory() {
        E00.a aVar = this.errorStateFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("errorStateFactory");
        throw null;
    }

    @NotNull
    public final C00.a getInitialWidgetsProvider() {
        C00.a aVar = this.initialWidgetsProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("initialWidgetsProvider");
        throw null;
    }

    @NotNull
    public final Set<g> getInterceptors() {
        Set<g> set = this.interceptors;
        if (set != null) {
            return set;
        }
        Intrinsics.n("interceptors");
        throw null;
    }

    @Override // ru.ozon.app.android.uikit.container.ExternalOffsetHandler
    public int getMaxBottomOffset() {
        i iVar = this.composerScreenUiContainer;
        if (iVar != null) {
            return iVar.P();
        }
        return 0;
    }

    @Override // ru.ozon.uni.atoms.af.pool.CacheHolder
    /* renamed from: getRecycledAtomPool, reason: from getter */
    public RecycledAtomPool getAtomPool() {
        return this.atomPool;
    }

    @NotNull
    public final ComposerComposeThemeWrapper getThemeWrapper() {
        ComposerComposeThemeWrapper composerComposeThemeWrapper = this.themeWrapper;
        if (composerComposeThemeWrapper != null) {
            return composerComposeThemeWrapper;
        }
        Intrinsics.n("themeWrapper");
        throw null;
    }

    @Override // fk0.d
    /* renamed from: getViewPool, reason: from getter */
    public c getPrefetchViewPool() {
        return this.prefetchViewPool;
    }

    @NotNull
    public final Pc.a<c> getViewPoolProvider() {
        Pc.a<c> aVar = this.viewPoolProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("viewPoolProvider");
        throw null;
    }

    @NotNull
    public final Set<Widget> getWidgets() {
        Set<Widget> set = this.widgets;
        if (set != null) {
            return set;
        }
        Intrinsics.n("widgets");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        if (!getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.composer.universalscreen.view.ComposerFragment$onActivityResult$$inlined$whenStarted$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    J.this.getLifecycle().e(this);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    Iterator<T> it = this.getConfigurators().iterator();
                    while (it.hasNext()) {
                        ((ComposerScreenConfig.PageConfigurator) it.next()).onActivityResult(requestCode, resultCode, data);
                    }
                    J.this.getLifecycle().e(this);
                }
            });
            return;
        }
        Iterator<T> it = getConfigurators().iterator();
        while (it.hasNext()) {
            ((ComposerScreenConfig.PageConfigurator) it.next()).onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // oZ.InterfaceC8677a
    public void onAnchorReturn(@NotNull String deeplink, boolean refresh) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        List<ComposerScreenConfig.PageConfigurator> configurators = getConfigurators();
        ArrayList arrayList = new ArrayList();
        for (Object obj : configurators) {
            if (obj instanceof InterfaceC8677a) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            if (refresh) {
                getComposerStore().c(new a.u.b(deeplink, null, null, null, false, null, 126));
            }
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC8677a) it.next()).onAnchorReturn(deeplink, refresh);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r2 == null) goto L22;
     */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(@NotNull Context context) {
        ComposerScreenConfig composerScreenConfig;
        DisplayMode displayMode;
        Object obj;
        Parcelable parcelable;
        Object parcelable2;
        Intrinsics.checkNotNullParameter(context, "context");
        long nanoTime = System.nanoTime();
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("EXTRA_COMPOSER_SCREEN_CONFIG", ComposerScreenConfig.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = arguments.getParcelable("EXTRA_COMPOSER_SCREEN_CONFIG");
            }
            composerScreenConfig = (ComposerScreenConfig) parcelable;
        } else {
            composerScreenConfig = null;
        }
        if (composerScreenConfig == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        setConfig(composerScreenConfig);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = arguments2.getSerializable("ARG_DISPLAY_MODE", DisplayMode.class);
            } else {
                Object serializable = arguments2.getSerializable("ARG_DISPLAY_MODE");
                if (!(serializable instanceof DisplayMode)) {
                    serializable = null;
                }
                obj = (DisplayMode) serializable;
            }
            displayMode = (DisplayMode) obj;
        }
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig = getConfig().getBottomSheetConfig();
        displayMode = bottomSheetConfig != null ? bottomSheetConfig.getDisplayMode() : DisplayMode.REGULAR;
        setDisplayMode(displayMode);
        ComposerFragmentComponent.Factory factory = DaggerComposerFragmentComponent.factory();
        ComposerScreenConfig config = getConfig();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) dependencyStorage.b(AnalyticsScreenStorageComponentApi.class);
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage2.b(ComposerComponentApi.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage3.b(NetworkComponentApi.class);
        if (ComposerFragmentComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerFragmentComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage4 = C6739a.a(context, ComposerFragmentComponentDependencies.class).getDependencyStorage();
        if (ComposerFragmentComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerFragmentComponentDependencies is not DiComponent");
        }
        factory.create(config, analyticsScreenStorageComponentApi, composerComponentApi, networkComponentApi, (ComposerFragmentComponentDependencies) dependencyStorage4.b(ComposerFragmentComponentDependencies.class)).inject(this);
        getFragmentController().getPagePerformanceTracker().a(nanoTime);
        super.onAttach(context);
        Object parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = getActivity();
        }
        this.host = parentFragment instanceof Host ? (Host) parentFragment : null;
        this.permissionRequestBuilder = new PermissionRequest.Builder(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<T> it = getConfigurators().iterator();
        while (it.hasNext()) {
            ((ComposerScreenConfig.PageConfigurator) it.next()).onConfigurationChanged(newConfig);
        }
        getController().update(new ConfigurationChangedEvent(newConfig));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Integer softInputMode = getConfig().getSoftInputMode();
        if (softInputMode != null) {
            SoftInputChangeDelegate softInputChangeDelegate = new SoftInputChangeDelegate(softInputMode.intValue());
            r requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            softInputChangeDelegate.register(requireActivity, this);
            this.softInputInputChangeDelegate = softInputChangeDelegate;
        }
        ConfiguratorReferences configuratorReferences = new ConfiguratorReferences(getFragmentController());
        for (ComposerScreenConfig.PageConfigurator pageConfigurator : getConfigurators()) {
            pageConfigurator.composerInitialized(configuratorReferences);
            pageConfigurator.onRestoreInstanceState(savedInstanceState, getViewModelOwnerProvider());
            getLifecycle().a(pageConfigurator);
        }
        getFragmentController().getPagePerformanceTracker().j(System.nanoTime());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        getFragmentController().getPagePerformanceTracker().b(System.nanoTime());
        i createComposerScreenUiContainer = getFragmentController().createComposerScreenUiContainer(inflater, container);
        this.composerScreenUiContainer = createComposerScreenUiContainer;
        receiveInAppPush(container);
        return createComposerScreenUiContainer.Y();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        getFragmentController().clear();
        this.atomPool = null;
        this.prefetchViewPool = null;
        this.composerScreenUiContainer = null;
        InAppPushHost inAppPushHost = ExtKt.getInAppPushHost(this);
        if (inAppPushHost != null) {
            inAppPushHost.onPageViewDestroyed(getConfig().getPageRef());
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDetach() {
        this.host = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        super.onPause();
        getHandler().removeCallbacks(this.loading);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onRequestPermissionsResult(final int requestCode, @NotNull final String[] permissions, @NotNull final int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (!getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.composer.universalscreen.view.ComposerFragment$onRequestPermissionsResult$$inlined$whenStarted$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    J.this.getLifecycle().e(this);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    Iterator<T> it = this.getConfigurators().iterator();
                    while (it.hasNext()) {
                        ((ComposerScreenConfig.PageConfigurator) it.next()).onRequestPermissionsResult(requestCode, permissions, grantResults);
                    }
                    J.this.getLifecycle().e(this);
                }
            });
            return;
        }
        Iterator<T> it = getConfigurators().iterator();
        while (it.hasNext()) {
            ((ComposerScreenConfig.PageConfigurator) it.next()).onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        getHandler().post(this.loading);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Iterator<T> it = getConfigurators().iterator();
        while (it.hasNext()) {
            ((ComposerScreenConfig.PageConfigurator) it.next()).onSaveInstanceState(outState, getViewModelOwnerProvider());
        }
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onStop() {
        super.onStop();
        q qVar = q.f64554a;
        String componentCallbacksC5392m = toString();
        Intrinsics.checkNotNullExpressionValue(componentCallbacksC5392m, "toString(...)");
        qVar.c(componentCallbacksC5392m);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        updateStatusBar();
        Host host = this.host;
        if (host != null) {
            host.onComposerCreated(this, getFragmentController(), this.composerScreenUiContainer);
        }
        initScreenAnalytics();
        this.atomPool = getAtomPoolProvider().get();
        this.prefetchViewPool = getViewPoolProvider().get();
        getHandler().post(this.loading);
        getFragmentController().getPagePerformanceTracker().i(System.nanoTime());
    }

    @Override // ru.ozon.app.android.permission.PermissionRequester
    public void requestPermission(@NotNull Function1<? super PermissionRequest.Builder, Unit> buildPermissionRequest) {
        Intrinsics.checkNotNullParameter(buildPermissionRequest, "buildPermissionRequest");
        PermissionRequest.Builder builder = this.permissionRequestBuilder;
        if (builder == null) {
            Intrinsics.n("permissionRequestBuilder");
            throw null;
        }
        buildPermissionRequest.invoke(builder);
        builder.build().execute();
    }

    @Override // NZ.k
    public void scrollToTop() {
        View view;
        AppBarLayout composerAppbar;
        k.a<l> e11 = getComposerStore().b().e();
        if (CollectionExtKt.isNullOrEmpty(e11 != null ? e11.a() : null)) {
            return;
        }
        getController().l(0);
        ComponentCallbacksC5392m c11 = getOwnerContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerAppbar = ComposerViewExtensionKt.composerAppbar(view)) == null) {
            return;
        }
        composerAppbar.s(true);
    }

    public final void scrollToWidget(@NotNull String widgetComponent, boolean includeToolbarHeight, int offset) {
        Intrinsics.checkNotNullParameter(widgetComponent, "widgetComponent");
        getController().c(widgetComponent, Integer.valueOf(offset), includeToolbarHeight);
    }

    public final void scrollToWidgetKey(int widgetKey, int offset, boolean smooth) {
        InterfaceC7851b.a.b(getController(), widgetKey, offset, smooth, 8);
    }

    @Override // ru.ozon.app.android.uikit.container.ExternalOffsetHandler
    public void setBottomOffset(int offset) {
        i iVar = this.composerScreenUiContainer;
        if (iVar != null) {
            iVar.j0(offset);
        }
    }

    public final void setConfig(@NotNull ComposerScreenConfig composerScreenConfig) {
        Intrinsics.checkNotNullParameter(composerScreenConfig, "<set-?>");
        this.config = composerScreenConfig;
    }

    public final void setDisplayMode(@NotNull DisplayMode displayMode) {
        Intrinsics.checkNotNullParameter(displayMode, "<set-?>");
        this.displayMode = displayMode;
    }

    @Override // ru.ozon.app.android.uikit.container.ExternalOffsetHandler
    public void setMaxBottomOffset(int offset) {
        i iVar = this.composerScreenUiContainer;
        if (iVar != null) {
            iVar.n0(offset);
        }
    }

    public final void startLoading(@NotNull String deeplink, h.b oneTimePostProcessing) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        getComposerStore().c(new a.u.b(deeplink, null, null, null, false, oneTimePostProcessing, 94));
    }

    public final void startLoading(@NotNull h.c pageRef) {
        Intrinsics.checkNotNullParameter(pageRef, "pageRef");
        if (pageRef instanceof h.c.a) {
            getComposerStore().c(new a.u.b(((h.c.a) pageRef).f(), null, null, null, false, null, 126));
        } else {
            if (!(pageRef instanceof h.c.b)) {
                throw new o();
            }
            getComposerStore().c(new a.u.b(null, ((h.c.b) pageRef).a(), null, null, false, null, 125));
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }
}
