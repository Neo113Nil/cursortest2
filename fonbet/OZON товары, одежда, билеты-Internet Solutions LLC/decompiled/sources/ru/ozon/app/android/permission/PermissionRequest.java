package ru.ozon.app.android.permission;

import Ty.C4053d;
import android.app.Activity;
import androidx.activity.ActivityC5043j;
import androidx.core.content.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import c20.n;
import com.google.gson.internal.c;
import g.AbstractC6592d;
import g.InterfaceC6590b;
import h.C6762h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/permission/PermissionRequest;", "", "Lru/ozon/app/android/permission/PermissionRequest$ActivityProvider;", "activityProvider", "Lg/d;", "", "", "requestPermissionLauncher", "Lru/ozon/app/android/permission/PermissionRequest$State;", "state", "<init>", "(Lru/ozon/app/android/permission/PermissionRequest$ActivityProvider;Lg/d;Lru/ozon/app/android/permission/PermissionRequest$State;)V", "", "execute", "()V", "Lru/ozon/app/android/permission/PermissionRequest$ActivityProvider;", "Lg/d;", "Lru/ozon/app/android/permission/PermissionRequest$State;", "Builder", "ActivityProvider", "State", "RequestPermissionCallback", "permission_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PermissionRequest {

    @NotNull
    private final ActivityProvider activityProvider;

    @NotNull
    private final AbstractC6592d<String[]> requestPermissionLauncher;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/permission/PermissionRequest$ActivityProvider;", "", "provide", "Landroid/app/Activity;", "permission_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ActivityProvider {
        Activity provide();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR?\u0010\u0012\u001a*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u0004\u0012\u00020\u0010`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/permission/PermissionRequest$RequestPermissionCallback;", "Lg/b;", "", "", "", "Lru/ozon/app/android/permission/PermissionRequest$ActivityProvider;", "activityProvider", "<init>", "(Lru/ozon/app/android/permission/PermissionRequest$ActivityProvider;)V", "grantedMap", "", "onActivityResult", "(Ljava/util/Map;)V", "Lru/ozon/app/android/permission/PermissionRequest$ActivityProvider;", "Ljava/util/HashMap;", "", "Lru/ozon/app/android/permission/PermissionRequest$State;", "Lkotlin/collections/HashMap;", "states", "Ljava/util/HashMap;", "getStates", "()Ljava/util/HashMap;", "permission_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class RequestPermissionCallback implements InterfaceC6590b<Map<String, ? extends Boolean>> {

        @NotNull
        private final ActivityProvider activityProvider;

        @NotNull
        private final HashMap<Set<String>, State> states;

        public RequestPermissionCallback(@NotNull ActivityProvider activityProvider) {
            Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
            this.activityProvider = activityProvider;
            this.states = new HashMap<>();
        }

        @NotNull
        public final HashMap<Set<String>, State> getStates() {
            return this.states;
        }

        @Override // g.InterfaceC6590b
        public /* bridge */ /* synthetic */ void onActivityResult(Map<String, ? extends Boolean> map) {
            onActivityResult2((Map<String, Boolean>) map);
        }

        /* renamed from: onActivityResult, reason: avoid collision after fix types in other method */
        public void onActivityResult2(@NotNull Map<String, Boolean> grantedMap) {
            State remove;
            boolean shouldShowRequestPermissionRationale;
            Intrinsics.checkNotNullParameter(grantedMap, "grantedMap");
            Activity provide = this.activityProvider.provide();
            if (provide == null || (remove = this.states.remove(grantedMap.keySet())) == null) {
                return;
            }
            Collection<Boolean> values = grantedMap.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                        shouldShowRequestPermissionRationale = PermissionRequestKt.shouldShowRequestPermissionRationale(provide, remove.requirePermissions(), remove.getShowRequestPermissionRationale());
                        if (shouldShowRequestPermissionRationale) {
                            Function0<Unit> showRequestPermissionRationale = remove.getShowRequestPermissionRationale();
                            if (showRequestPermissionRationale != null) {
                                showRequestPermissionRationale.invoke();
                                return;
                            }
                            return;
                        }
                        Function0<Unit> onPermissionDenied = remove.getOnPermissionDenied();
                        if (onPermissionDenied != null) {
                            onPermissionDenied.invoke();
                            return;
                        }
                        return;
                    }
                }
            }
            remove.requireOnPermissionGranted().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0002\u0018\u00002\u00020\u0001BO\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0013R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0017R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0017R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/permission/PermissionRequest$State;", "", "", "", "permissions", "Lkotlin/Function0;", "", "onPermissionGranted", "showRequestPermissionRationale", "onPermissionDenied", "<init>", "(Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "requirePermissions", "()Ljava/util/Set;", "requireOnPermissionGranted", "()Lkotlin/jvm/functions/Function0;", "Ljava/util/Set;", "getPermissions", "setPermissions", "(Ljava/util/Set;)V", "Lkotlin/jvm/functions/Function0;", "getOnPermissionGranted", "setOnPermissionGranted", "(Lkotlin/jvm/functions/Function0;)V", "getShowRequestPermissionRationale", "setShowRequestPermissionRationale", "getOnPermissionDenied", "setOnPermissionDenied", "permission_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class State {
        private Function0<Unit> onPermissionDenied;
        private Function0<Unit> onPermissionGranted;
        private Set<String> permissions;
        private Function0<Unit> showRequestPermissionRationale;

        public State() {
            this(null, null, null, null, 15, null);
        }

        public final Function0<Unit> getOnPermissionDenied() {
            return this.onPermissionDenied;
        }

        public final Function0<Unit> getShowRequestPermissionRationale() {
            return this.showRequestPermissionRationale;
        }

        @NotNull
        public final Function0<Unit> requireOnPermissionGranted() {
            Function0<Unit> function0 = this.onPermissionGranted;
            if (function0 != null) {
                return function0;
            }
            throw new IllegalStateException("`onPermissionGranted` callback should be set ");
        }

        @NotNull
        public final Set<String> requirePermissions() {
            Set<String> set = this.permissions;
            if (set != null) {
                return set;
            }
            throw new IllegalStateException("`permissions` should be set ");
        }

        public final void setOnPermissionDenied(Function0<Unit> function0) {
            this.onPermissionDenied = function0;
        }

        public final void setOnPermissionGranted(Function0<Unit> function0) {
            this.onPermissionGranted = function0;
        }

        public final void setPermissions(Set<String> set) {
            this.permissions = set;
        }

        public final void setShowRequestPermissionRationale(Function0<Unit> function0) {
            this.showRequestPermissionRationale = function0;
        }

        public State(Set<String> set, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            this.permissions = set;
            this.onPermissionGranted = function0;
            this.showRequestPermissionRationale = function02;
            this.onPermissionDenied = function03;
        }

        public /* synthetic */ State(Set set, Function0 function0, Function0 function02, Function0 function03, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : set, (i11 & 2) != 0 ? null : function0, (i11 & 4) != 0 ? null : function02, (i11 & 8) != 0 ? null : function03);
        }
    }

    public /* synthetic */ PermissionRequest(ActivityProvider activityProvider, AbstractC6592d abstractC6592d, State state, DefaultConstructorMarker defaultConstructorMarker) {
        this(activityProvider, abstractC6592d, state);
    }

    public final void execute() {
        boolean shouldShowRequestPermissionRationale;
        Activity provide = this.activityProvider.provide();
        if (provide == null) {
            return;
        }
        Set<String> requirePermissions = this.state.requirePermissions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : requirePermissions) {
            if (a.checkSelfPermission(provide, (String) obj) != 0) {
                arrayList.add(obj);
            }
        }
        Set Y02 = C7714v.Y0(arrayList);
        if (Y02.isEmpty()) {
            this.state.requireOnPermissionGranted().invoke();
            return;
        }
        shouldShowRequestPermissionRationale = PermissionRequestKt.shouldShowRequestPermissionRationale(provide, Y02, this.state.getShowRequestPermissionRationale());
        if (!shouldShowRequestPermissionRationale) {
            this.requestPermissionLauncher.a(Y02.toArray(new String[0]));
            return;
        }
        Function0<Unit> showRequestPermissionRationale = this.state.getShowRequestPermissionRationale();
        if (showRequestPermissionRationale != null) {
            showRequestPermissionRationale.invoke();
        }
    }

    private PermissionRequest(ActivityProvider activityProvider, AbstractC6592d<String[]> abstractC6592d, State state) {
        this.activityProvider = activityProvider;
        this.requestPermissionLauncher = abstractC6592d;
        this.state = state;
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0019\u0010\u0014J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/permission/PermissionRequest$Builder;", "", "Landroidx/activity/j;", "activity", "<init>", "(Landroidx/activity/j;)V", "Landroidx/fragment/app/m;", "fragment", "(Landroidx/fragment/app/m;)V", "Landroidx/lifecycle/v;", "", "addCallbackStateInvalidateListener", "(Landroidx/lifecycle/v;)V", "", "", "permissions", "([Ljava/lang/String;)Lru/ozon/app/android/permission/PermissionRequest$Builder;", "Lkotlin/Function0;", "action", "onPermissionGranted", "(Lkotlin/jvm/functions/Function0;)Lru/ozon/app/android/permission/PermissionRequest$Builder;", "", "isNeeded", "showRequestPermissionRationale", "(ZLkotlin/jvm/functions/Function0;)Lru/ozon/app/android/permission/PermissionRequest$Builder;", "onPermissionDenied", "Lru/ozon/app/android/permission/PermissionRequest;", "build", "()Lru/ozon/app/android/permission/PermissionRequest;", "Lg/d;", "requestPermissionLauncher", "Lg/d;", "Lru/ozon/app/android/permission/PermissionRequest$ActivityProvider;", "activityProvider", "Lru/ozon/app/android/permission/PermissionRequest$ActivityProvider;", "Lru/ozon/app/android/permission/PermissionRequest$RequestPermissionCallback;", "callback", "Lru/ozon/app/android/permission/PermissionRequest$RequestPermissionCallback;", "Lru/ozon/app/android/permission/PermissionRequest$State;", "state", "Lru/ozon/app/android/permission/PermissionRequest$State;", "permission_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private final ActivityProvider activityProvider;

        @NotNull
        private final RequestPermissionCallback callback;

        @NotNull
        private final AbstractC6592d<String[]> requestPermissionLauncher;

        @NotNull
        private State state;

        public Builder(@NotNull ActivityC5043j activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.state = new State(null, null, null, null, 15, null);
            C4053d c4053d = new C4053d(activity);
            this.activityProvider = c4053d;
            RequestPermissionCallback requestPermissionCallback = new RequestPermissionCallback(c4053d);
            this.callback = requestPermissionCallback;
            this.requestPermissionLauncher = activity.registerForActivityResult(new C6762h(), requestPermissionCallback);
            AbstractC5434v lifecycle = activity.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            addCallbackStateInvalidateListener(lifecycle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Activity _init_$lambda$0(ActivityC5043j activityC5043j) {
            return activityC5043j;
        }

        private final void addCallbackStateInvalidateListener(AbstractC5434v abstractC5434v) {
            abstractC5434v.a(new n(this, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void addCallbackStateInvalidateListener$lambda$8(Builder builder, J j11, AbstractC5434v.a event) {
            Intrinsics.checkNotNullParameter(j11, "<unused var>");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC5434v.a.ON_DESTROY) {
                builder.callback.getStates().clear();
            }
        }

        @NotNull
        public final PermissionRequest build() {
            this.callback.getStates().put(this.state.requirePermissions(), this.state);
            PermissionRequest permissionRequest = new PermissionRequest(this.activityProvider, this.requestPermissionLauncher, this.state, null);
            this.state = new State(null, null, null, null, 15, null);
            return permissionRequest;
        }

        @NotNull
        public final Builder onPermissionDenied(@NotNull Function0<Unit> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.state.setOnPermissionDenied(action);
            return this;
        }

        @NotNull
        public final Builder onPermissionGranted(@NotNull Function0<Unit> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.state.setOnPermissionGranted(action);
            return this;
        }

        @NotNull
        public final Builder permissions(@NotNull String... permissions) {
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.state.setPermissions(C7705l.j0(permissions));
            return this;
        }

        @NotNull
        public final Builder showRequestPermissionRationale(boolean isNeeded, @NotNull Function0<Unit> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            State state = this.state;
            if (!isNeeded) {
                action = null;
            }
            state.setShowRequestPermissionRationale(action);
            return this;
        }

        public Builder(@NotNull ComponentCallbacksC5392m fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.state = new State(null, null, null, null, 15, null);
            c cVar = new c(fragment);
            this.activityProvider = cVar;
            RequestPermissionCallback requestPermissionCallback = new RequestPermissionCallback(cVar);
            this.callback = requestPermissionCallback;
            this.requestPermissionLauncher = fragment.registerForActivityResult(new C6762h(), requestPermissionCallback);
            AbstractC5434v lifecycle = fragment.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            addCallbackStateInvalidateListener(lifecycle);
        }
    }
}
