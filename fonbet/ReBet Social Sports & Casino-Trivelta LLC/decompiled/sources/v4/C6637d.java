package v4;

import com.brentvatne.exoplayer.ReactExoplayerViewManager;
import com.brentvatne.react.VideoDecoderInfoModule;
import com.brentvatne.react.VideoManagerModule;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u4.C6503i;
import u4.InterfaceC6492C;

/* renamed from: v4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6637d implements ReactPackage {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6492C f67023a;

    /* JADX WARN: Multi-variable type inference failed */
    public C6637d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.ReactPackage
    public List createNativeModules(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.listOf((Object[]) new ReactContextBaseJavaModule[]{new VideoDecoderInfoModule(reactContext), new VideoManagerModule(reactContext)});
    }

    @Override // com.facebook.react.ReactPackage
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        InterfaceC6492C interfaceC6492C = this.f67023a;
        if (interfaceC6492C == null) {
            interfaceC6492C = new C6503i(reactContext, null, 2, null);
        }
        return CollectionsKt.listOf(new ReactExoplayerViewManager(interfaceC6492C));
    }

    public C6637d(InterfaceC6492C interfaceC6492C) {
        this.f67023a = interfaceC6492C;
    }

    public /* synthetic */ C6637d(InterfaceC6492C interfaceC6492C, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : interfaceC6492C);
    }
}
