package com.swmansion.rnscreens;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.rnscreens.gamma.scrollviewmarker.ScrollViewMarkerViewManager;
import com.swmansion.rnscreens.gamma.stack.header.config.StackHeaderConfigViewManager;
import com.swmansion.rnscreens.gamma.stack.header.subview.StackHeaderSubviewViewManager;
import com.swmansion.rnscreens.gamma.stack.host.StackHostViewManager;
import com.swmansion.rnscreens.gamma.stack.screen.StackScreenViewManager;
import com.swmansion.rnscreens.gamma.tabs.host.TabsHostViewManager;
import com.swmansion.rnscreens.gamma.tabs.screen.TabsScreenViewManager;
import com.swmansion.rnscreens.safearea.SafeAreaViewManager;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.swmansion.rnscreens.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3827s extends BaseReactPackage {

    /* renamed from: b, reason: collision with root package name */
    public static final a f42038b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public ScreenDummyLayoutHelper f42039a;

    /* renamed from: com.swmansion.rnscreens.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$0() {
        HashMap hashMap = new HashMap();
        hashMap.put("RNSModule", new ReactModuleInfo("RNSModule", "RNSModule", false, false, true, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f42039a = new ScreenDummyLayoutHelper(reactContext);
        C3819j.f41972a.e(reactContext);
        return CollectionsKt.listOf((Object[]) new ViewManager[]{new ScreenContainerViewManager(), new ScreenViewManager(), new ModalScreenViewManager(), new ScreenStackViewManager(), new ScreenStackHeaderConfigViewManager(), new ScreenStackHeaderSubviewManager(), new SearchBarManager(), new ScreenFooterManager(), new ScreenContentWrapperManager(), new TabsHostViewManager(), new TabsScreenViewManager(), new SafeAreaViewManager(), new StackHostViewManager(), new StackScreenViewManager(), new ScrollViewMarkerViewManager(), new StackHeaderConfigViewManager(), new StackHeaderSubviewViewManager()});
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String s10, ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(s10, "s");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        if (Intrinsics.areEqual(s10, "RNSModule")) {
            return new ScreensModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: com.swmansion.rnscreens.r
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                Map reactModuleInfoProvider$lambda$0;
                reactModuleInfoProvider$lambda$0 = C3827s.getReactModuleInfoProvider$lambda$0();
                return reactModuleInfoProvider$lambda$0;
            }
        };
    }
}
