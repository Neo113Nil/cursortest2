package expo.modules.contacts.next;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.contacts.MissingPermissionException;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.Exceptions;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactsPermissionsDelegate.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u000eR\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lexpo/modules/contacts/next/ContactsPermissionsDelegate;", "", "appContext", "Lexpo/modules/kotlin/AppContext;", "<init>", "(Lexpo/modules/kotlin/AppContext;)V", "weakAppContextRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "permissionsManager", "Lexpo/modules/interfaces/permissions/Permissions;", "getPermissionsManager", "()Lexpo/modules/interfaces/permissions/Permissions;", "requestPermissions", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/Promise;", "getPermissions", "ensureReadPermission", "ensureWritePermission", "ensurePermissions", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactsPermissionsDelegate {
    private final WeakReference<AppContext> weakAppContextRef;

    public ContactsPermissionsDelegate(AppContext appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.weakAppContextRef = new WeakReference<>(appContext);
    }

    private final Permissions getPermissionsManager() {
        Permissions permissions;
        AppContext appContext = this.weakAppContextRef.get();
        if (appContext == null || (permissions = appContext.getPermissions()) == null) {
            throw new Exceptions.PermissionsModuleNotFound();
        }
        return permissions;
    }

    public final void requestPermissions(Promise promise) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (getPermissionsManager().isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
            strArr = new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
        } else {
            strArr = new String[]{"android.permission.READ_CONTACTS"};
        }
        Permissions.askForPermissionsWithPermissionsManager(getPermissionsManager(), promise, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void getPermissions(Promise promise) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (getPermissionsManager().isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
            strArr = new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
        } else {
            strArr = new String[]{"android.permission.READ_CONTACTS"};
        }
        Permissions.getPermissionsWithPermissionsManager(getPermissionsManager(), promise, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void ensureReadPermission() {
        if (!getPermissionsManager().hasGrantedPermissions("android.permission.READ_CONTACTS")) {
            throw new MissingPermissionException("android.permission.READ_CONTACTS");
        }
    }

    public final void ensureWritePermission() {
        if (!getPermissionsManager().hasGrantedPermissions("android.permission.WRITE_CONTACTS")) {
            throw new MissingPermissionException("android.permission.WRITE_CONTACTS");
        }
    }

    public final void ensurePermissions() {
        ensureReadPermission();
        ensureWritePermission();
    }
}
