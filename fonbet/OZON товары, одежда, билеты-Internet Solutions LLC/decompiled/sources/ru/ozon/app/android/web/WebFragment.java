package ru.ozon.app.android.web;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.activity.C;
import androidx.activity.J;
import androidx.appcompat.app.AbstractC5051a;
import androidx.appcompat.app.g;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.t;
import androidx.core.view.InterfaceC5348w;
import androidx.core.view.Q0;
import androidx.core.view.r;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.AbstractC6592d;
import g.C6589a;
import g.InterfaceC6590b;
import gi.C6739a;
import gi.C6740b;
import h.C6756b;
import h.j;
import hi.InterfaceC6958a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import nc.C8486a;
import oZ.InterfaceC8677a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.feature.common.web.R$id;
import ru.ozon.app.android.feature.common.web.R$layout;
import ru.ozon.app.android.feature.common.web.R$menu;
import ru.ozon.app.android.feature.common.web.R$string;
import ru.ozon.app.android.feature.common.web.databinding.FragmentWebStandardBinding;
import ru.ozon.app.android.inapppush.InAppPushHost;
import ru.ozon.app.android.inapppush.util.ExtKt;
import ru.ozon.app.android.navigation.newrouter.ui.fragment.FullScreenFragmentObserver;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.flags.AppLikeWebViewFlag;
import ru.ozon.app.android.network.flags.WebViewCacheFlag;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.uikit.view.toolbar.ToolbarWithTeeth;
import ru.ozon.app.android.web.WebFragment;
import ru.ozon.app.android.web.di.WebComponent;
import ru.ozon.app.android.web.di.WebComponentApi;
import ru.ozon.app.android.web.uidelegate.WebFragmentUiDelegate;
import ru.ozon.app.android.web.webview.OzonWebView;
import ru.ozon.app.android.web.webview.WebViewRouter;
import ru.ozon.app.android.web.webview.cache.WebViewResourcesManager;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0004»\u0001¾\u0001\b\u0016\u0018\u0000 Ë\u00012\u00020\u00012\u00020\u0002:\u0002Ë\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\u0004J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001cH\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0014¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0007H\u0014¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0007H\u0004¢\u0006\u0004\b(\u0010\u0004J\u0019\u0010)\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0004¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010\u0004J\u0019\u0010,\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b,\u0010\rJ\u0011\u0010-\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0007H\u0002¢\u0006\u0004\b1\u0010\u0004J\u0013\u00103\u001a\u00020\u0007*\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0013\u00105\u001a\u00020\u0007*\u000202H\u0002¢\u0006\u0004\b5\u00104J\u000f\u00106\u001a\u00020\u0007H\u0002¢\u0006\u0004\b6\u0010\u0004J\u000f\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u0010\u0004J+\u0010>\u001a\u00020\u00072\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09082\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u001cH\u0002¢\u0006\u0004\bA\u0010%J\u000f\u0010B\u001a\u00020\u0007H\u0002¢\u0006\u0004\bB\u0010\u0004J\u0013\u0010D\u001a\u00020\u0007*\u00020CH\u0002¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00020\u0007*\u00020CH\u0002¢\u0006\u0004\bF\u0010EJ\u000f\u0010G\u001a\u00020\u0007H\u0002¢\u0006\u0004\bG\u0010\u0004J\u000f\u0010H\u001a\u00020\u0007H\u0002¢\u0006\u0004\bH\u0010\u0004R\"\u0010J\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010Q\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010X\u001a\u00020W8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010_\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR(\u0010g\u001a\b\u0012\u0004\u0012\u00020f0e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010n\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010t\u001a\u00020\u001e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u00100\"\u0004\bw\u0010xR$\u0010z\u001a\u0004\u0018\u00010y8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u001f\u0010\u0082\u0001\u001a\u00020\u001e8DX\u0084\u0084\u0002¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u00100R\u0019\u0010\u0083\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010uR\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001f\u0010\u008c\u0001\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u008b\u0001\u0010\u0081\u0001\u001a\u0005\b\u008c\u0001\u00100R\u001f\u0010\u008e\u0001\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u0081\u0001\u001a\u0005\b\u008e\u0001\u00100R\u001f\u0010\u0091\u0001\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u008f\u0001\u0010\u0081\u0001\u001a\u0005\b\u0090\u0001\u00100R!\u0010\u0096\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0081\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R!\u0010\u0099\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0081\u0001\u001a\u0006\b\u0098\u0001\u0010\u0095\u0001R!\u0010\u009c\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0081\u0001\u001a\u0006\b\u009b\u0001\u0010\u0095\u0001R!\u0010\u009f\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u0081\u0001\u001a\u0006\b\u009e\u0001\u0010\u0095\u0001R!\u0010¢\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b \u0001\u0010\u0081\u0001\u001a\u0006\b¡\u0001\u0010\u0095\u0001R!\u0010¥\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b£\u0001\u0010\u0081\u0001\u001a\u0006\b¤\u0001\u0010\u0095\u0001R!\u0010¨\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u0081\u0001\u001a\u0006\b§\u0001\u0010\u0095\u0001R\u001b\u0010©\u0001\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R%\u0010;\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010«\u0001R\u001c\u0010¬\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010®\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010°\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010uR!\u0010µ\u0001\u001a\u00030±\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b²\u0001\u0010\u0081\u0001\u001a\u0006\b³\u0001\u0010´\u0001R)\u0010¹\u0001\u001a\u0014\u0012\u000f\u0012\r ¸\u0001*\u0005\u0018\u00010·\u00010·\u00010¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010¼\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010¿\u0001\u001a\u00030¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0018\u0010Â\u0001\u001a\u00030Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010Ç\u0001\u001a\u00030Ä\u00018TX\u0094\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0017\u0010Ê\u0001\u001a\u00020C8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001¨\u0006Ì\u0001"}, d2 = {"Lru/ozon/app/android/web/WebFragment;", "Landroidx/fragment/app/m;", "LoZ/a;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPause", "outState", "onSaveInstanceState", "onDestroyView", "", "deeplink", "", "refresh", "onAnchorReturn", "(Ljava/lang/String;Z)V", "onDetach", SelectionItemFormDTO.TITLE_FIELD_NAME, "setToolbarTitle", "(Ljava/lang/String;)V", "handleBackAction", "setupNavigation", "handleShareAction", "receiveInAppPush", "(Landroid/view/ViewGroup;)V", "setupWebView", "restoreWebViewStateOrLoadUrl", "saveWebViewState", "()Landroid/os/Bundle;", "isInBottomSheet", "()Z", "setupBack", "Landroidx/core/view/r;", "setupMenu", "(Landroidx/core/view/r;)V", "removeMenu", "setupZoom", "setFullscreen", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "uploadMessage", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "showFileChooser", "(Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)V", "text", "showShareDialog", "setupToolbarNavigation", "Lru/ozon/app/android/feature/common/web/databinding/FragmentWebStandardBinding;", "setupRegularDrawToolbarElevation", "(Lru/ozon/app/android/feature/common/web/databinding/FragmentWebStandardBinding;)V", "setupRegularDrawScreenColors", "setupOriginalScreenColors", "applyDarkNavbarWithTeeth", "Lru/ozon/app/android/web/webview/WebViewRouter;", "webViewRouter", "Lru/ozon/app/android/web/webview/WebViewRouter;", "getWebViewRouter", "()Lru/ozon/app/android/web/webview/WebViewRouter;", "setWebViewRouter", "(Lru/ozon/app/android/web/webview/WebViewRouter;)V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "setFeatureChecker", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/web/webview/cache/WebViewResourcesManager;", "webViewCacheManager", "Lru/ozon/app/android/web/webview/cache/WebViewResourcesManager;", "getWebViewCacheManager", "()Lru/ozon/app/android/web/webview/cache/WebViewResourcesManager;", "setWebViewCacheManager", "(Lru/ozon/app/android/web/webview/cache/WebViewResourcesManager;)V", "Lru/ozon/app/android/web/uidelegate/WebFragmentUiDelegate;", "aiWebFragmentUiDelegate", "Lru/ozon/app/android/web/uidelegate/WebFragmentUiDelegate;", "getAiWebFragmentUiDelegate", "()Lru/ozon/app/android/web/uidelegate/WebFragmentUiDelegate;", "setAiWebFragmentUiDelegate", "(Lru/ozon/app/android/web/uidelegate/WebFragmentUiDelegate;)V", "LPc/a;", "Lru/ozon/app/android/web/WebFragmentViewModelImpl;", "webFragmentViewModelProvider", "LPc/a;", "getWebFragmentViewModelProvider", "()LPc/a;", "setWebFragmentViewModelProvider", "(LPc/a;)V", "Lru/ozon/app/android/web/WebFragmentViewModel;", "viewModel", "Lru/ozon/app/android/web/WebFragmentViewModel;", "getViewModel", "()Lru/ozon/app/android/web/WebFragmentViewModel;", "setViewModel", "(Lru/ozon/app/android/web/WebFragmentViewModel;)V", "shouldShowNavBar", "Z", "getShouldShowNavBar", "setShouldShowNavBar", "(Z)V", "Lru/ozon/app/android/web/OnReceiveTitleListener;", "receiveTitleListener", "Lru/ozon/app/android/web/OnReceiveTitleListener;", "getReceiveTitleListener", "()Lru/ozon/app/android/web/OnReceiveTitleListener;", "setReceiveTitleListener", "(Lru/ozon/app/android/web/OnReceiveTitleListener;)V", "isShareEnabled$delegate", "LSc/j;", "isShareEnabled", ImagesContract.URL, "Ljava/lang/String;", "Landroid/webkit/WebView;", "ozonWebView", "Landroid/webkit/WebView;", "isBackStackDisabled", "mBinding", "Lru/ozon/app/android/feature/common/web/databinding/FragmentWebStandardBinding;", "isRegularDrawWebView$delegate", "isRegularDrawWebView", "isAiConversation$delegate", "isAiConversation", "hasTeeth$delegate", "getHasTeeth", "hasTeeth", "", "backgroundColor$delegate", "getBackgroundColor", "()I", "backgroundColor", "contentColor$delegate", "getContentColor", "contentColor", "titleColor$delegate", "getTitleColor", "titleColor", "iconColor$delegate", "getIconColor", "iconColor", "selectIconColor$delegate", "getSelectIconColor", "selectIconColor", "selectTitleColor$delegate", "getSelectTitleColor", "selectTitleColor", "darkToolbarColor$delegate", "getDarkToolbarColor", "darkToolbarColor", "webViewState", "Landroid/os/Bundle;", "Landroid/webkit/ValueCallback;", "oldSoftInputType", "Ljava/lang/Integer;", "originalNavigationBackground", "I", "originalIsAppearanceLightNavigationBars", "Landroidx/appcompat/widget/AppCompatTextView;", "titleTextView$delegate", "getTitleTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "titleTextView", "Lg/d;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "fileChooserActivityCallback", "Lg/d;", "ru/ozon/app/android/web/WebFragment$menuProvider$1", "menuProvider", "Lru/ozon/app/android/web/WebFragment$menuProvider$1;", "ru/ozon/app/android/web/WebFragment$onBackStackChangedListener$1", "onBackStackChangedListener", "Lru/ozon/app/android/web/WebFragment$onBackStackChangedListener$1;", "Lnc/a;", "compositeDisposable", "Lnc/a;", "Lru/ozon/app/android/web/webview/OzonWebView;", "getWebView", "()Lru/ozon/app/android/web/webview/OzonWebView;", "webView", "getBinding", "()Lru/ozon/app/android/feature/common/web/databinding/FragmentWebStandardBinding;", "binding", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class WebFragment extends ComponentCallbacksC5392m implements InterfaceC8677a {
    private static boolean usedRegularDrawColors;
    public WebFragmentUiDelegate aiWebFragmentUiDelegate;

    @NotNull
    private final C8486a compositeDisposable;
    public FeatureChecker featureChecker;

    @NotNull
    private final AbstractC6592d<Intent> fileChooserActivityCallback;
    private boolean isBackStackDisabled;
    private FragmentWebStandardBinding mBinding;

    @NotNull
    private final WebFragment$menuProvider$1 menuProvider;
    private Integer oldSoftInputType;

    @NotNull
    private final WebFragment$onBackStackChangedListener$1 onBackStackChangedListener;
    private int originalNavigationBackground;
    private WebView ozonWebView;
    private OnReceiveTitleListener receiveTitleListener;
    private ValueCallback<Uri[]> uploadMessage;
    private String url;
    public WebFragmentViewModel viewModel;
    public Pc.a<WebFragmentViewModelImpl> webFragmentViewModelProvider;
    public WebViewResourcesManager webViewCacheManager;
    public WebViewRouter webViewRouter;
    private Bundle webViewState;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, String> IMAGES = U.j(new Pair(".jpg", "image/*"), new Pair(".png", "image/*"), new Pair(".jpeg", "image/*"));
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final int titleBottomPadding = ResourceExtKt.toPx(27);
    private static final int toolbarWithTeethHeight = ResourceExtKt.toPx(80);

    @NotNull
    private static final InterfaceC4008j<String> regularDrawDeeplink$delegate = k.b(WebFragment$Companion$regularDrawDeeplink$2.INSTANCE);
    private boolean shouldShowNavBar = true;

    /* renamed from: isShareEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isShareEnabled = k.b(new WebFragment$isShareEnabled$2(this));

    /* renamed from: isRegularDrawWebView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isRegularDrawWebView = k.b(new WebFragment$isRegularDrawWebView$2(this));

    /* renamed from: isAiConversation$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isAiConversation = k.b(new WebFragment$isAiConversation$2(this));

    /* renamed from: hasTeeth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hasTeeth = k.b(new WebFragment$hasTeeth$2(this));

    /* renamed from: backgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundColor = k.b(new WebFragment$backgroundColor$2(this));

    /* renamed from: contentColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j contentColor = k.b(new WebFragment$contentColor$2(this));

    /* renamed from: titleColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j titleColor = k.b(new WebFragment$titleColor$2(this));

    /* renamed from: iconColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconColor = k.b(new WebFragment$iconColor$2(this));

    /* renamed from: selectIconColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j selectIconColor = k.b(new WebFragment$selectIconColor$2(this));

    /* renamed from: selectTitleColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j selectTitleColor = k.b(new WebFragment$selectTitleColor$2(this));

    /* renamed from: darkToolbarColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j darkToolbarColor = k.b(new WebFragment$darkToolbarColor$2(this));
    private boolean originalIsAppearanceLightNavigationBars = true;

    /* renamed from: titleTextView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j titleTextView = k.b(new WebFragment$titleTextView$2(this));

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0081\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001bR\u0014\u0010'\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u001bR\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u001bR\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u001bR\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u001bR \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010(R\u0014\u00106\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010(R\u0014\u00107\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010(¨\u00068"}, d2 = {"Lru/ozon/app/android/web/WebFragment$Companion;", "", "<init>", "()V", "", ImagesContract.URL, "", "isInBottomSheet", "dismissAndRedirectUrl", "shouldShowNavBar", "isBackStackDisabled", "isFullScreen", "isFullScreenWebView", "isShareEnabled", "isZoomEnabled", "isRegularDrawWebView", "hasTeeth", "isAiConversation", "Lru/ozon/app/android/web/WebFragment;", "newInstance", "(Ljava/lang/String;ZLjava/lang/String;ZZZZZZZZZ)Lru/ozon/app/android/web/WebFragment;", "regularDrawDeeplink$delegate", "LSc/j;", "getRegularDrawDeeplink", "()Ljava/lang/String;", "regularDrawDeeplink", "EXTRA_URL", "Ljava/lang/String;", "DISMISS_AND_REDIRECT_URL", "EXTRA_IS_IN_BOTTOM_SHEET", "EXTRA_SHOULD_SHOW_NAV_BAR", "EXTRA_IS_BACK_STACK_DISABLED", "EXTRA_IS_FULL_SCREEN", "EXTRA_IS_FULL_SCREEN_WEB_VIEW", "EXTRA_IS_SHARE_ENABLED", "IS_REGULAR_DRAW_WEB_VIEW", "IS_AI_CONVERSATION_WEB_VIEW", "HAS_TEETH", "", "NO_TOOLBAR_MARGIN", "I", "", "REGULAR_DRAW_TOOLBAR_ELEVATION", "F", "GAMEAPP", "HOME", "SHARE_MIME_TYPE", "WEB_VIEW_STATE", "", "IMAGES", "Ljava/util/Map;", "usedRegularDrawColors", "Z", "dp16", "titleBottomPadding", "toolbarWithTeethHeight", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getRegularDrawDeeplink() {
            return (String) WebFragment.regularDrawDeeplink$delegate.getValue();
        }

        public static /* synthetic */ WebFragment newInstance$default(Companion companion, String str, boolean z11, String str2, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, int i11, Object obj) {
            boolean z22;
            Companion companion2;
            String str3;
            boolean z23;
            String str4;
            boolean z24 = (i11 & 8) != 0 ? true : z12;
            boolean z25 = (i11 & 16) != 0 ? false : z13;
            boolean z26 = (i11 & 32) != 0 ? false : z14;
            boolean z27 = (i11 & 64) != 0 ? true : z15;
            boolean z28 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z16;
            boolean z29 = (i11 & 256) != 0 ? false : z17;
            boolean z31 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z18;
            boolean z32 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z19;
            if ((i11 & 2048) != 0) {
                z22 = false;
                str3 = str;
                z23 = z11;
                str4 = str2;
                companion2 = companion;
            } else {
                z22 = z21;
                companion2 = companion;
                str3 = str;
                z23 = z11;
                str4 = str2;
            }
            return companion2.newInstance(str3, z23, str4, z24, z25, z26, z27, z28, z29, z31, z32, z22);
        }

        @NotNull
        public final WebFragment newInstance(@NotNull String url, boolean isInBottomSheet, String dismissAndRedirectUrl, boolean shouldShowNavBar, boolean isBackStackDisabled, boolean isFullScreen, boolean isFullScreenWebView, boolean isShareEnabled, boolean isZoomEnabled, boolean isRegularDrawWebView, boolean hasTeeth, boolean isAiConversation) {
            Intrinsics.checkNotNullParameter(url, "url");
            WebFragment webFragment = new WebFragment();
            Bundle bundle = new Bundle();
            bundle.putString("extra_url", url);
            bundle.putString("dismiss_and_redirect_url", dismissAndRedirectUrl);
            bundle.putBoolean("extra_is_in_bottom_sheet", isInBottomSheet);
            bundle.putBoolean("extra_should_show_nav_bar", shouldShowNavBar);
            bundle.putBoolean("EXTRA_IS_BACK_STACK_DISABLED", isBackStackDisabled);
            bundle.putBoolean("EXTRA_IS_SHARE_ENABLED", isShareEnabled);
            bundle.putBoolean("EXTRA_IS_FULL_SCREEN", isFullScreen);
            bundle.putBoolean("EXTRA_IS_FULL_SCREEN_WEB_VIEW", isFullScreenWebView);
            bundle.putBoolean("zoom_enabled", isZoomEnabled);
            bundle.putBoolean("IS_REGULAR_DRAW_WEB_VIEW", isRegularDrawWebView);
            bundle.putBoolean("HAS_TEETH", hasTeeth);
            bundle.putBoolean("IS_AI_CONVERSATION_WEB_VIEW", isAiConversation);
            webFragment.setArguments(bundle);
            return webFragment;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ru.ozon.app.android.web.WebFragment$menuProvider$1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [ru.ozon.app.android.web.WebFragment$onBackStackChangedListener$1] */
    public WebFragment() {
        AbstractC6592d<Intent> registerForActivityResult = registerForActivityResult(new j(), new InterfaceC6590b() { // from class: HY.f
            @Override // g.InterfaceC6590b
            public final void onActivityResult(Object obj) {
                WebFragment.fileChooserActivityCallback$lambda$0(WebFragment.this, (C6589a) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.fileChooserActivityCallback = registerForActivityResult;
        this.menuProvider = new InterfaceC5348w() { // from class: ru.ozon.app.android.web.WebFragment$menuProvider$1
            @Override // androidx.core.view.InterfaceC5348w
            public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
                boolean isRegularDrawWebView;
                int iconColor;
                int contentColor;
                Intrinsics.checkNotNullParameter(menu, "menu");
                Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
                isRegularDrawWebView = WebFragment.this.isRegularDrawWebView();
                if (isRegularDrawWebView) {
                    menuInflater.inflate(R$menu.menu_web_fragment_game_mode, menu);
                    Drawable icon = menu.findItem(R$id.reload).getIcon();
                    if (icon != null) {
                        contentColor = WebFragment.this.getContentColor();
                        icon.setTint(contentColor);
                        return;
                    }
                    return;
                }
                if (WebFragment.this.isShareEnabled()) {
                    menuInflater.inflate(R$menu.menu_web_fragment, menu);
                    Drawable icon2 = menu.findItem(R$id.share).getIcon();
                    if (icon2 != null) {
                        iconColor = WebFragment.this.getIconColor();
                        icon2.setTint(iconColor);
                    }
                }
            }

            @Override // androidx.core.view.InterfaceC5348w
            public boolean onMenuItemSelected(MenuItem menuItem) {
                Intrinsics.checkNotNullParameter(menuItem, "menuItem");
                int itemId = menuItem.getItemId();
                if (itemId == R$id.share) {
                    WebFragment.this.handleShareAction();
                    return true;
                }
                if (itemId != R$id.reload) {
                    return false;
                }
                WebFragment.this.getWebView().reload();
                return true;
            }
        };
        this.onBackStackChangedListener = new G.p() { // from class: ru.ozon.app.android.web.WebFragment$onBackStackChangedListener$1
            @Override // androidx.fragment.app.G.p
            public void onBackStackChangeStarted(ComponentCallbacksC5392m fragment, boolean pop) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                if (fragment instanceof WebFragment) {
                    return;
                }
                WebFragment.this.setupOriginalScreenColors();
            }

            @Override // androidx.fragment.app.G.p
            public void onBackStackChanged() {
            }
        };
        this.compositeDisposable = new C8486a();
    }

    private final void applyDarkNavbarWithTeeth() {
        if (getHasTeeth()) {
            ToolbarWithTeeth toolbarWithTeeth = getBinding().toolbar;
            toolbarWithTeeth.setHasTeeth(true);
            toolbarWithTeeth.setToolbarPaintColor(getDarkToolbarColor());
            toolbarWithTeeth.setTitleTextColor(getSelectTitleColor());
            ViewGroup.LayoutParams layoutParams = toolbarWithTeeth.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = toolbarWithTeethHeight;
            toolbarWithTeeth.setLayoutParams(layoutParams);
            toolbarWithTeeth.setPadding(toolbarWithTeeth.getPaddingLeft(), toolbarWithTeeth.getPaddingTop(), toolbarWithTeeth.getPaddingRight(), titleBottomPadding);
            StatusBarController.INSTANCE.setStatusBarBackgroundColor(this, StatusBarController.UpdateReason.NewState.INSTANCE, getDarkToolbarColor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void fileChooserActivityCallback$lambda$0(WebFragment webFragment, C6589a it) {
        Collection collection;
        Intrinsics.checkNotNullParameter(it, "it");
        ValueCallback<Uri[]> valueCallback = webFragment.uploadMessage;
        if (valueCallback != 0) {
            new C6756b();
            int b11 = it.b();
            Intent a11 = it.a();
            if (b11 != -1) {
                a11 = null;
            }
            if (a11 == null || (collection = C6756b.a.a(a11)) == null) {
                collection = K.f71697a;
            }
            valueCallback.onReceiveValue(collection.toArray(new Uri[0]));
        }
        webFragment.uploadMessage = null;
    }

    private final int getBackgroundColor() {
        return ((Number) this.backgroundColor.getValue()).intValue();
    }

    private final FragmentWebStandardBinding getBinding() {
        FragmentWebStandardBinding fragmentWebStandardBinding = this.mBinding;
        Intrinsics.f(fragmentWebStandardBinding);
        return fragmentWebStandardBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContentColor() {
        return ((Number) this.contentColor.getValue()).intValue();
    }

    private final int getDarkToolbarColor() {
        return ((Number) this.darkToolbarColor.getValue()).intValue();
    }

    private final boolean getHasTeeth() {
        return ((Boolean) this.hasTeeth.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getIconColor() {
        return ((Number) this.iconColor.getValue()).intValue();
    }

    private final int getSelectIconColor() {
        return ((Number) this.selectIconColor.getValue()).intValue();
    }

    private final int getSelectTitleColor() {
        return ((Number) this.selectTitleColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTitleColor() {
        return ((Number) this.titleColor.getValue()).intValue();
    }

    private final AppCompatTextView getTitleTextView() {
        return (AppCompatTextView) this.titleTextView.getValue();
    }

    private final boolean isAiConversation() {
        return ((Boolean) this.isAiConversation.getValue()).booleanValue();
    }

    private final boolean isInBottomSheet() {
        Bundle arguments = getArguments();
        Boolean valueOf = arguments != null ? Boolean.valueOf(arguments.getBoolean("extra_is_in_bottom_sheet")) : null;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRegularDrawWebView() {
        return ((Boolean) this.isRegularDrawWebView.getValue()).booleanValue();
    }

    private final void removeMenu(r rVar) {
        rVar.removeMenuProvider(this.menuProvider);
    }

    private final void restoreWebViewStateOrLoadUrl(Bundle savedInstanceState) {
        Bundle bundle = this.webViewState;
        if (bundle == null) {
            bundle = savedInstanceState != null ? savedInstanceState.getBundle("WebFragment.webViewState") : null;
        }
        if (bundle != null) {
            WebView webView = this.ozonWebView;
            if ((webView != null ? webView.restoreState(bundle) : null) != null) {
                return;
            }
        }
        this.webViewState = null;
        OzonWebView webView2 = getWebView();
        String str = this.url;
        if (str != null) {
            webView2.loadUrl(str);
        } else {
            Intrinsics.n(ImagesContract.URL);
            throw null;
        }
    }

    private final Bundle saveWebViewState() {
        Bundle bundle = new Bundle();
        WebView webView = this.ozonWebView;
        if ((webView != null ? webView.saveState(bundle) : null) != null) {
            return bundle;
        }
        return null;
    }

    private final void setFullscreen() {
        boolean z11;
        if (getFeatureChecker().isEnabled(AppLikeWebViewFlag.INSTANCE)) {
            z11 = true;
        } else {
            Bundle arguments = getArguments();
            z11 = false;
            if (arguments != null) {
                z11 = arguments.getBoolean("EXTRA_IS_FULL_SCREEN", false);
            }
        }
        Bundle arguments2 = getArguments();
        getWebView().setFullscreen(arguments2 != null ? arguments2.getBoolean("EXTRA_IS_FULL_SCREEN_WEB_VIEW", true) : true);
        if (z11) {
            FullScreenFragmentObserver.Companion.showFullScreen$default(FullScreenFragmentObserver.INSTANCE, this, false, 0L, 6, null);
        }
    }

    private final void setupBack() {
        J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, new C() { // from class: ru.ozon.app.android.web.WebFragment$setupBack$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                WebFragment.this.handleBackAction();
            }
        });
    }

    private final void setupMenu(r rVar) {
        rVar.addMenuProvider(this.menuProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupOriginalScreenColors() {
        OzonWebView ozonWebView;
        if (usedRegularDrawColors) {
            Window window = requireActivity().getWindow();
            StatusBarController.setStatusBarContentColor$default(StatusBarController.INSTANCE, this, StatusBarController.UpdateReason.NewState.INSTANCE, true, false, 8, null);
            window.setNavigationBarColor(this.originalNavigationBackground);
            window.setStatusBarColor(this.originalNavigationBackground);
            new Q0(window.getDecorView(), window).d(this.originalIsAppearanceLightNavigationBars);
            FragmentWebStandardBinding fragmentWebStandardBinding = this.mBinding;
            if (fragmentWebStandardBinding != null && (ozonWebView = fragmentWebStandardBinding.webView) != null) {
                ozonWebView.setBlankColor(null);
            }
            usedRegularDrawColors = false;
        }
    }

    private final void setupRegularDrawScreenColors(FragmentWebStandardBinding fragmentWebStandardBinding) {
        Window window = requireActivity().getWindow();
        Q0 q02 = new Q0(window.getDecorView(), window);
        Intrinsics.checkNotNullExpressionValue(q02, "getInsetsController(...)");
        fragmentWebStandardBinding.toolbar.setBackgroundColor(getBackgroundColor());
        fragmentWebStandardBinding.getConstraintLayout().setBackgroundColor(getBackgroundColor());
        if (usedRegularDrawColors) {
            return;
        }
        this.originalNavigationBackground = window.getNavigationBarColor();
        this.originalIsAppearanceLightNavigationBars = q02.b();
        StatusBarController.setStatusBarContentColor$default(StatusBarController.INSTANCE, this, StatusBarController.UpdateReason.NewState.INSTANCE, true, false, 8, null);
        window.setNavigationBarColor(getBackgroundColor());
        window.setStatusBarColor(getBackgroundColor());
        q02.d(false);
        fragmentWebStandardBinding.webView.setBlankColor(Integer.valueOf(getBackgroundColor()));
        usedRegularDrawColors = true;
    }

    private final void setupRegularDrawToolbarElevation(FragmentWebStandardBinding fragmentWebStandardBinding) {
        if (isRegularDrawWebView()) {
            fragmentWebStandardBinding.toolbar.setElevation(0.0f);
        }
    }

    private final void setupToolbarNavigation() {
        setHasOptionsMenu(true);
        androidx.fragment.app.r activity = getActivity();
        Intrinsics.g(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        g gVar = (g) activity;
        gVar.setSupportActionBar(getBinding().toolbar);
        AbstractC5051a supportActionBar = gVar.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.m(true);
            int i11 = this.isBackStackDisabled ? R$drawable.ic_m_cross_compact : R$drawable.ic_m_disclosure_back_filled;
            int contentColor = isRegularDrawWebView() ? getContentColor() : getHasTeeth() ? getSelectIconColor() : getIconColor();
            Drawable drawable = androidx.core.content.a.getDrawable(requireContext(), i11);
            supportActionBar.q(drawable);
            if (drawable != null) {
                drawable.setTint(contentColor);
            }
        }
        getBinding().toolbar.setTitle("");
        ToolbarWithTeeth toolbar = getBinding().toolbar;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        ViewExtKt.show(toolbar);
    }

    private final void setupWebView() {
        WebView webView = getWebView().getWebView();
        if (webView != null) {
            ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = isInBottomSheet() ? -2 : -1;
            layoutParams.width = -1;
            webView.setLayoutParams(layoutParams);
        } else {
            webView = null;
        }
        this.ozonWebView = webView;
        getWebView().setOnRedirectListener(new WebFragment$setupWebView$2(this));
        OzonWebView webView2 = getWebView();
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        webView2.init(viewLifecycleOwner);
        boolean isEnabled = getFeatureChecker().isEnabled(WebViewCacheFlag.INSTANCE);
        if (isEnabled) {
            this.compositeDisposable.a(WebViewResourcesManager.DefaultImpls.actualizeCache$default(getWebViewCacheManager(), 0, 0, null, 7, null));
        }
        getWebView().setResourcesCacheEnabled(isEnabled);
        getWebView().setOnShowFileChooserListener(new WebFragment$setupWebView$3(this));
        getWebView().setOnPageFinishedListener(new WebFragment$setupWebView$4(this));
        getWebView().setOnReceiveTitleListener(new OnReceiveTitleListener() { // from class: HY.e
            @Override // ru.ozon.app.android.web.OnReceiveTitleListener
            public final void receiveTitle(String str) {
                WebFragment.setupWebView$lambda$8(WebFragment.this, str);
            }
        });
        setFullscreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupWebView$lambda$8(WebFragment webFragment, String str) {
        webFragment.getViewModel().updateTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupZoom() {
        WebSettings settings;
        Bundle arguments = getArguments();
        boolean z11 = arguments != null ? arguments.getBoolean("zoom_enabled") : false;
        WebView webView = this.ozonWebView;
        if (webView == null || (settings = webView.getSettings()) == null) {
            return;
        }
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(z11);
        settings.setSupportZoom(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFileChooser(ValueCallback<Uri[]> uploadMessage, WebChromeClient.FileChooserParams fileChooserParams) {
        List m11;
        ValueCallback<Uri[]> valueCallback = this.uploadMessage;
        String str = null;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        this.uploadMessage = uploadMessage;
        Intent createIntent = fileChooserParams.createIntent();
        String type = createIntent.getType();
        if (type != null && (m11 = h.m(type, new String[]{","}, 0, 6)) != null) {
            str = C7714v.V(m11, null, null, null, WebFragment$showFileChooser$1.INSTANCE, 31);
        }
        createIntent.setType(str);
        try {
            this.fileChooserActivityCallback.a(createIntent);
        } catch (ActivityNotFoundException e11) {
            Lm0.a.f17149a.e(e11);
            ViewGroup rootView = ContextExtKt.getRootView(this);
            if (rootView != null) {
                FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, StringProvider.getString(R$string.error_web_cannot_open_file_chooser), null, 3000L, null, this, 42, null).show();
            }
        }
    }

    private final void showShareDialog(String text) {
        t.a aVar = new t.a(requireActivity());
        aVar.g("text/plain");
        aVar.f(text);
        aVar.c(ru.ozon.app.android.uikit.R$string.common_action_share);
        aVar.h();
    }

    @NotNull
    public final WebFragmentUiDelegate getAiWebFragmentUiDelegate() {
        WebFragmentUiDelegate webFragmentUiDelegate = this.aiWebFragmentUiDelegate;
        if (webFragmentUiDelegate != null) {
            return webFragmentUiDelegate;
        }
        Intrinsics.n("aiWebFragmentUiDelegate");
        throw null;
    }

    @NotNull
    public final FeatureChecker getFeatureChecker() {
        FeatureChecker featureChecker = this.featureChecker;
        if (featureChecker != null) {
            return featureChecker;
        }
        Intrinsics.n("featureChecker");
        throw null;
    }

    protected final OnReceiveTitleListener getReceiveTitleListener() {
        return this.receiveTitleListener;
    }

    protected final boolean getShouldShowNavBar() {
        return this.shouldShowNavBar;
    }

    @NotNull
    public final WebFragmentViewModel getViewModel() {
        WebFragmentViewModel webFragmentViewModel = this.viewModel;
        if (webFragmentViewModel != null) {
            return webFragmentViewModel;
        }
        Intrinsics.n("viewModel");
        throw null;
    }

    @NotNull
    public final Pc.a<WebFragmentViewModelImpl> getWebFragmentViewModelProvider() {
        Pc.a<WebFragmentViewModelImpl> aVar = this.webFragmentViewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("webFragmentViewModelProvider");
        throw null;
    }

    @NotNull
    protected OzonWebView getWebView() {
        OzonWebView webView = getBinding().webView;
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        return webView;
    }

    @NotNull
    public final WebViewResourcesManager getWebViewCacheManager() {
        WebViewResourcesManager webViewResourcesManager = this.webViewCacheManager;
        if (webViewResourcesManager != null) {
            return webViewResourcesManager;
        }
        Intrinsics.n("webViewCacheManager");
        throw null;
    }

    @NotNull
    public final WebViewRouter getWebViewRouter() {
        WebViewRouter webViewRouter = this.webViewRouter;
        if (webViewRouter != null) {
            return webViewRouter;
        }
        Intrinsics.n("webViewRouter");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleBackAction() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("dismiss_and_redirect_url") : null;
        if (getWebView().canGoBack() && !this.isBackStackDisabled) {
            getWebView().goBack();
        } else if (string != null) {
            getWebViewRouter().dismissAndRedirect(string);
        } else {
            getWebViewRouter().popBackStack();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void handleShareAction() {
        String str;
        WebView webView = getWebView().getWebView();
        if ((webView == null || (str = webView.getUrl()) == null) && (str = this.url) == null) {
            Intrinsics.n(ImagesContract.URL);
            throw null;
        }
        showShareDialog(str);
    }

    protected final boolean isShareEnabled() {
        return ((Boolean) this.isShareEnabled.getValue()).booleanValue();
    }

    @Override // oZ.InterfaceC8677a
    public void onAnchorReturn(@NotNull String deeplink, boolean refresh) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (refresh) {
            OzonWebView webView = getWebView();
            String queryParameter = Uri.parse(deeplink).getQueryParameter(ImagesContract.URL);
            if (queryParameter == null && (queryParameter = this.url) == null) {
                Intrinsics.n(ImagesContract.URL);
                throw null;
            }
            webView.loadUrl(queryParameter);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (WebComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WebComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, WebComponentApi.class).getDependencyStorage();
        if (WebComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WebComponentApi is not DiComponent");
        }
        ((WebComponent) dependencyStorage.b(WebComponentApi.class)).inject(this);
        super.onAttach(context);
        if (getParentFragment() != null) {
            InterfaceC5431s parentFragment = getParentFragment();
            this.receiveTitleListener = parentFragment instanceof OnReceiveTitleListener ? (OnReceiveTitleListener) parentFragment : null;
        }
        if (this.receiveTitleListener == null) {
            this.receiveTitleListener = context instanceof OnReceiveTitleListener ? (OnReceiveTitleListener) context : null;
        }
        getParentFragmentManager().k(this.onBackStackChangedListener);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        boolean booleanValue;
        Window window;
        Window window2;
        WindowManager.LayoutParams attributes;
        super.onCreate(savedInstanceState);
        setViewModel((WebFragmentViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.web.WebFragment$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                WebFragmentViewModelImpl webFragmentViewModelImpl = WebFragment.this.getWebFragmentViewModelProvider().get();
                Intrinsics.g(webFragmentViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return webFragmentViewModelImpl;
            }
        }).a(WebFragmentViewModelImpl.class));
        androidx.fragment.app.r activity = getActivity();
        this.oldSoftInputType = (activity == null || (window2 = activity.getWindow()) == null || (attributes = window2.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        androidx.fragment.app.r activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("extra_url") : null;
        if (string == null) {
            string = "";
        }
        this.url = string;
        String string2 = StringProvider.getString(R$string.web_webview_title);
        Boolean bool = getFeatureChecker().isEnabled(AppLikeWebViewFlag.INSTANCE) ? Boolean.FALSE : null;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Bundle arguments2 = getArguments();
            Boolean valueOf = arguments2 != null ? Boolean.valueOf(arguments2.getBoolean("extra_should_show_nav_bar")) : null;
            booleanValue = valueOf != null ? valueOf.booleanValue() : true;
        }
        this.shouldShowNavBar = booleanValue;
        Bundle arguments3 = getArguments();
        this.isBackStackDisabled = arguments3 != null ? arguments3.getBoolean("EXTRA_IS_BACK_STACK_DISABLED") : false;
        getViewModel().setDefaultTitle(string2);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.mBinding = FragmentWebStandardBinding.bind(inflater.inflate(R$layout.fragment_web_standard, container, false));
        if (isRegularDrawWebView()) {
            ToolbarWithTeeth toolbar = getBinding().toolbar;
            Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
            if (toolbar.indexOfChild(getTitleTextView()) == -1) {
                toolbar.addView(getTitleTextView());
            }
            setupRegularDrawScreenColors(getBinding());
            setupRegularDrawToolbarElevation(getBinding());
        }
        getAiWebFragmentUiDelegate().applyUi(this, getBinding(), isAiConversation());
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        setupMenu(requireActivity);
        receiveInAppPush(container);
        return getBinding().getConstraintLayout();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        Window window;
        this.compositeDisposable.d();
        this.ozonWebView = null;
        Integer num = this.oldSoftInputType;
        if (num != null) {
            int intValue = num.intValue();
            androidx.fragment.app.r activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(intValue);
            }
        }
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        removeMenu(requireActivity);
        if (isRegularDrawWebView()) {
            getBinding().toolbar.removeView(getTitleTextView());
        }
        getAiWebFragmentUiDelegate().restoreUi(this, isAiConversation());
        super.onDestroyView();
        this.mBinding = null;
        InAppPushHost inAppPushHost = ExtKt.getInAppPushHost(this);
        if (inAppPushHost != null) {
            String str = this.url;
            if (str != null) {
                inAppPushHost.onPageViewDestroyed(str);
            } else {
                Intrinsics.n(ImagesContract.URL);
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDetach() {
        super.onDetach();
        this.receiveTitleListener = null;
        getParentFragmentManager().a1(this.onBackStackChangedListener);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        super.onPause();
        Bundle saveWebViewState = saveWebViewState();
        if (saveWebViewState != null) {
            this.webViewState = saveWebViewState;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Bundle saveWebViewState = saveWebViewState();
        if (saveWebViewState == null) {
            saveWebViewState = this.webViewState;
        }
        if (saveWebViewState != null) {
            outState.putBundle("WebFragment.webViewState", saveWebViewState);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setupBack();
        setupNavigation();
        setupWebView();
        applyDarkNavbarWithTeeth();
        restoreWebViewStateOrLoadUrl(savedInstanceState);
        getViewModel().getToolbarTitle().observe(getViewLifecycleOwner(), new WebFragment$sam$androidx_lifecycle_Observer$0(new WebFragment$onViewCreated$1(this)));
    }

    protected final void receiveInAppPush(ViewGroup container) {
        InAppPushHost inAppPushHost;
        if (!(container instanceof FrameLayout) || (inAppPushHost = ExtKt.getInAppPushHost(this)) == null) {
            return;
        }
        String str = this.url;
        if (str != null) {
            InAppPushHost.DefaultImpls.receiveInAppPush$default(inAppPushHost, str, this, (FrameLayout) container, (Long) null, 8, (Object) null);
        } else {
            Intrinsics.n(ImagesContract.URL);
            throw null;
        }
    }

    protected void setToolbarTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        if (isRegularDrawWebView()) {
            getTitleTextView().setText(title);
        } else {
            getBinding().toolbar.setTitle(title);
        }
        OnReceiveTitleListener onReceiveTitleListener = this.receiveTitleListener;
        if (onReceiveTitleListener != null) {
            onReceiveTitleListener.receiveTitle(title);
        }
    }

    public final void setViewModel(@NotNull WebFragmentViewModel webFragmentViewModel) {
        Intrinsics.checkNotNullParameter(webFragmentViewModel, "<set-?>");
        this.viewModel = webFragmentViewModel;
    }

    protected void setupNavigation() {
        if (this.shouldShowNavBar) {
            setupToolbarNavigation();
            return;
        }
        ToolbarWithTeeth toolbar = getBinding().toolbar;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        ViewExtKt.gone(toolbar);
        OzonWebView webView = getBinding().webView;
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = 0;
        webView.setLayoutParams(bVar);
    }
}
