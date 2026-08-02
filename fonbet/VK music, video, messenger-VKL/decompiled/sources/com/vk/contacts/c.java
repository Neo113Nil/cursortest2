package com.vk.contacts;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.contacts.ContactsManager;
import com.vk.contacts.c;
import com.vk.contacts.model.ContactsPermissionMessage;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.im.engine.exceptions.ImTaskExecutionException;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import defpackage.k0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a1w;
import xsna.a68;
import xsna.acj;
import xsna.apv0;
import xsna.asu0;
import xsna.b25;
import xsna.bay;
import xsna.bcj;
import xsna.bxe;
import xsna.c5g;
import xsna.c5v0;
import xsna.cbj;
import xsna.cm;
import xsna.daj;
import xsna.dw20;
import xsna.enj;
import xsna.epx;
import xsna.fbj;
import xsna.fl3;
import xsna.fp;
import xsna.gko;
import xsna.gzs;
import xsna.h7u0;
import xsna.izs;
import xsna.j5g;
import xsna.j8j;
import xsna.ncg;
import xsna.ni0;
import xsna.oa;
import xsna.paj0;
import xsna.q1w;
import xsna.q8j;
import xsna.qaj0;
import xsna.s3q0;
import xsna.s65;
import xsna.sje;
import xsna.tbj;
import xsna.tej;
import xsna.tlo0;
import xsna.tq;
import xsna.u62;
import xsna.uaj;
import xsna.ubj;
import xsna.vdg0;
import xsna.vkj;
import xsna.waj;
import xsna.x7g;
import xsna.x84;
import xsna.y62;
import xsna.y9e0;
import xsna.zbj;
import xsna.zq0;

/* compiled from: ContactsManagerImpl.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class c implements ContactsManager {
    public static boolean c;
    public static Future<ContactsManager.b> d;
    public static u62 e;
    public static bay f;
    public static y62 g;
    public static Context h;
    public static f i;
    public static volatile boolean k;
    public static ExecutorService l;
    public static ScheduledExecutorService m;
    public static b25 n;
    public static final c b = new c();
    public static final io.reactivex.rxjava3.subjects.f<daj> j = new io.reactivex.rxjava3.subjects.f<>();
    public static gzs<Boolean> o = new s65(2);

    /* compiled from: ContactsManagerImpl.kt */
    public static final class a {
        public final Context a;
        public final b25 b;
        public final bay c;
        public final apv0 d;
        public final ExecutorService e;
        public final ScheduledExecutorService f;
        public final y62 g;
        public final u62 h;
        public final i0 i;
        public final a68 j;

        public a() {
            throw null;
        }

        public a(Context context, b25 b25Var, bay bayVar, apv0 apv0Var, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, a68 a68Var) {
            y62 y62Var = new y62(context);
            u62 u62Var = new u62(context, apv0Var);
            PermissionHelper.a.getClass();
            i0 r = PermissionHelper.r(PermissionHelper.y);
            this.a = context;
            this.b = b25Var;
            this.c = bayVar;
            this.d = apv0Var;
            this.e = executorService;
            this.f = scheduledExecutorService;
            this.g = y62Var;
            this.h = u62Var;
            this.i = r;
            this.j = a68Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Config(context=" + this.a + ", authBridge=" + this.b + ", uploader=" + this.c + ", systemAccountProvider=" + this.d + ", apiExecutor=" + this.e + ", delayScheduleExecutor=" + this.f + ", storageManager=" + this.g + ", loader=" + this.h + ", contactsPermissions=" + this.i + ", isSyncPermitted=" + this.j + ')';
        }
    }

    /* compiled from: ContactsManagerImpl.kt */
    /* loaded from: classes17.dex */
    public interface b {

        /* compiled from: ContactsManagerImpl.kt */
        public static final class a implements b {
            public static final a a = new a();

            /* JADX WARN: Type inference failed for: r0v6, types: [T, xsna.dw20] */
            @Override // com.vk.contacts.c.b
            public final void a(Context context, boolean z, ContactsPermissionMessage contactsPermissionMessage, gzs gzsVar, izs izsVar) {
                boolean z2;
                Context context2 = context;
                while (true) {
                    z2 = context2 instanceof FragmentActivity;
                    if (z2 || !(context2 instanceof ContextWrapper)) {
                        break;
                    } else {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
                FragmentActivity fragmentActivity = (FragmentActivity) (z2 ? (Activity) context2 : null);
                if ((fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null) == null) {
                    c.b.P0(context, z, gzsVar, izsVar);
                    return;
                }
                PermissionHelper.a.getClass();
                boolean z3 = PermissionHelper.p(fragmentActivity, PermissionHelper.y) == PermissionHelper.PermissionResult.DONT_ASK_AGAIN;
                int i = z3 ? contactsPermissionMessage.i() : contactsPermissionMessage.k();
                int h = z3 ? contactsPermissionMessage.h() : contactsPermissionMessage.j();
                c cVar = c.b;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = c.j(context, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_user_book_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12), new c5v0.b(12, tq.h(tlo0.Companion, i), new tlo0.f(h)), null, new c5v0.a(z3 ? new c5v0.a.C2643a(new tlo0.f(R.string.vk_permissions_open_settings), new cm(10, fragmentActivity, ref$ObjectRef), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED) : new c5v0.a.C2643a(new tlo0.f(R.string.vk_permissions_ignore), new sje(ref$ObjectRef, 14), null, VkButton.Mode.Secondary, null, false, 444), z3 ? null : new c5v0.a.C2643a(new tlo0.f(R.string.vk_permissions_ok), new com.vk.im.ui.fragments.chat.a(context, gzsVar, izsVar, ref$ObjectRef, 1), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), false), 52));
            }
        }

        /* compiled from: ContactsManagerImpl.kt */
        /* renamed from: com.vk.contacts.c$b$b, reason: collision with other inner class name */
        public static final class C0728b implements b {
            public static final C0728b a = new C0728b();

            /* JADX WARN: Type inference failed for: r0v1, types: [T, xsna.dw20] */
            @Override // com.vk.contacts.c.b
            public final void a(Context context, boolean z, ContactsPermissionMessage contactsPermissionMessage, gzs gzsVar, izs izsVar) {
                boolean z2;
                Context context2 = context;
                while (true) {
                    z2 = context2 instanceof FragmentActivity;
                    if (z2 || !(context2 instanceof ContextWrapper)) {
                        break;
                    } else {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
                c5v0.a.C2643a c2643a = null;
                FragmentActivity fragmentActivity = (FragmentActivity) (z2 ? (Activity) context2 : null);
                if ((fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null) == null) {
                    c.b.P0(context, z, gzsVar, izsVar);
                    return;
                }
                PermissionHelper.a.getClass();
                if (PermissionHelper.p(fragmentActivity, PermissionHelper.y) != PermissionHelper.PermissionResult.DONT_ASK_AGAIN) {
                    c.b.P0(context, false, gzsVar, izsVar);
                    return;
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                c cVar = c.b;
                ref$ObjectRef.element = c.j(context, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_user_book_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12), new c5v0.b(12, tq.h(tlo0.Companion, R.string.vk_permissions_contacts_sync_setting_title), new tlo0.f(R.string.vk_permissions_contacts_sync_settings)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.vk_permissions_open_settings), new ni0(3, fragmentActivity, ref$ObjectRef), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), c2643a, 2), 52));
            }
        }

        void a(Context context, boolean z, ContactsPermissionMessage contactsPermissionMessage, gzs gzsVar, izs izsVar);
    }

    /* compiled from: ContactsManagerImpl.kt */
    /* renamed from: com.vk.contacts.c$c, reason: collision with other inner class name */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class C0729c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ContactsSource.values().length];
            try {
                iArr[ContactsSource.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContactsSource.SYSTEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ContactsManager.BottomSheetBehaviour.values().length];
            try {
                iArr2[ContactsManager.BottomSheetBehaviour.Always.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ContactsManager.BottomSheetBehaviour.WhenPermissionDenied.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static boolean b() {
        Context context = h;
        if (context == null) {
            context = null;
        }
        if (enj.l(context, "android.permission.READ_CONTACTS")) {
            f fVar = i;
            (fVar != null ? fVar : null).getClass();
            if (((paj0) f.c()).getBoolean("key_in_app_permission_granted", false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Future future) {
        return (future instanceof y9e0) && !((y9e0) future).c();
    }

    public static void f(ArrayList arrayList) {
        L.e("VkContactManager", "notifyContactsDeleted contactIds: " + arrayList);
        j.onNext(new waj(arrayList));
    }

    public static void g(Activity activity) {
        activity.startActivityForResult(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", activity.getPackageName(), null)), 0);
    }

    public static void h(boolean z) {
        f fVar = i;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        L.e("VkContactManager", "imported=" + z);
        qaj0.c(f.a(), "contacts_imported", Boolean.valueOf(z));
    }

    public static void i(ContactSyncState contactSyncState) {
        L.e("VkContactManager", "saveSyncState " + contactSyncState);
        f fVar = i;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        qaj0.c(f.c(), "key_sync_state", Integer.valueOf(contactSyncState.h()));
    }

    public static dw20 j(Context context, b.a.C0790b c0790b) {
        return new VkModal(VkModal.Mode.Card, c0790b, new x84(5), false, 20).b(context, "tag_contacts_sync");
    }

    public static y9e0 k(long j2) {
        L.e("VkContactManager", k0.a(j2, "submitSyncDelayed: delayMs="));
        Future<ContactsManager.b> future = d;
        if (future != null) {
            future.cancel(true);
        }
        y9e0 y9e0Var = new y9e0();
        ScheduledExecutorService scheduledExecutorService = m;
        if (scheduledExecutorService == null) {
            scheduledExecutorService = null;
        }
        scheduledExecutorService.schedule(new bcj(y9e0Var, 0), j2, TimeUnit.MILLISECONDS);
        d = y9e0Var;
        return y9e0Var;
    }

    public static Future l() {
        L.e("VkContactManager", "submitSyncNow: syncFuture=" + d);
        Future<ContactsManager.b> future = d;
        if (future != null) {
            future.cancel(true);
        }
        ExecutorService executorService = l;
        if (executorService == null) {
            executorService = null;
        }
        Future<ContactsManager.b> submit = executorService.submit(new Callable() { // from class: xsna.xbj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    return com.vk.contacts.c.b.m(true);
                } finally {
                    com.vk.contacts.c.d = null;
                }
            }
        });
        d = submit;
        return submit;
    }

    @Override // com.vk.contacts.ContactsManager
    public final ContactSyncState G0() {
        if (!o.invoke().booleanValue()) {
            return ContactSyncState.DONE;
        }
        f fVar = i;
        if (fVar == null) {
            fVar = null;
        }
        ContactSyncState contactSyncState = ContactSyncState.PERMITTED;
        fVar.getClass();
        int i2 = ((paj0) f.c()).getInt("key_sync_state", contactSyncState.h());
        ContactSyncState.Companion.getClass();
        for (ContactSyncState contactSyncState2 : ContactSyncState.values()) {
            if (contactSyncState2.h() == i2) {
                return contactSyncState2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.vk.contacts.ContactsManager
    public final boolean H0() {
        PermissionHelper permissionHelper = PermissionHelper.a;
        Context context = h;
        if (context == null) {
            context = null;
        }
        permissionHelper.getClass();
        if (PermissionHelper.n(context)) {
            f fVar = i;
            (fVar != null ? fVar : null).getClass();
            if (((paj0) f.c()).getBoolean("key_in_app_permission_granted", false)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.contacts.ContactsManager
    public final void I0(boolean z) {
        f fVar = i;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        f.d(z);
    }

    @Override // com.vk.contacts.ContactsManager
    public final void J0(Context context, ContactsManager.BottomSheetBehaviour bottomSheetBehaviour, boolean z, ContactsPermissionMessage contactsPermissionMessage, gzs<s3q0> gzsVar, izs<? super List<String>, s3q0> izsVar, gzs<s3q0> gzsVar2) {
        boolean z2;
        b bVar;
        PermissionHelper.a.getClass();
        boolean n2 = PermissionHelper.n(context);
        f fVar = i;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        boolean z3 = ((paj0) f.c()).getBoolean("key_in_app_permission_granted", false);
        if (n2 && z3) {
            if (gzsVar2 != null) {
                gzsVar2.invoke();
                return;
            }
            return;
        }
        if (!n2) {
            int i2 = C0729c.$EnumSwitchMapping$1[bottomSheetBehaviour.ordinal()];
            if (i2 == 1) {
                bVar = b.a.a;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = b.C0728b.a;
            }
            bVar.a(context, z, contactsPermissionMessage, gzsVar2, izsVar);
            return;
        }
        while (true) {
            z2 = context instanceof FragmentActivity;
            if (z2 || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        h7u0.a aVar = new h7u0.a(context);
        aVar.g0(R.string.sync_dialog_title);
        aVar.U(R.string.sync_dialog_description);
        aVar.c0(R.string.sync_dialog_enable, new tbj(gzsVar2, 0));
        aVar.W(R.string.sync_dialog_cancel, new bxe(izsVar, 1));
        aVar.a0(new ubj(gzsVar, 0));
        aVar.m();
    }

    @Override // com.vk.contacts.ContactsManager
    public final boolean L0() {
        f fVar = i;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        return ((paj0) f.a()).getBoolean("contacts_imported", false);
    }

    @Override // com.vk.contacts.ContactsManager
    public final void M0(Collection<Long> collection) {
        y62 y62Var = g;
        if (y62Var == null) {
            y62Var = null;
        }
        y62Var.b(collection);
    }

    @Override // com.vk.contacts.ContactsManager
    public final Long O0() {
        b25 b25Var = n;
        if (b25Var == null) {
            b25Var = null;
        }
        if (!b25Var.b()) {
            return null;
        }
        f fVar = i;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        long j2 = ((paj0) f.c()).getLong("key_contacts_last_update_time", 0L);
        Long valueOf = Long.valueOf(j2);
        if (j2 <= 0) {
            valueOf = null;
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.d;
            StringBuilder sb = new StringBuilder("getLastContactsUpdateTime ");
            sb.append(valueOf);
            sb.append(" uid=");
            b25 b25Var2 = n;
            sb.append((b25Var2 != null ? b25Var2 : null).c());
            sb.append(' ');
            L.u(l2, logType, new Object[]{"getDiff", sb.toString()});
        }
        return valueOf;
    }

    @Override // com.vk.contacts.ContactsManager
    public final void P0(Context context, boolean z, gzs<s3q0> gzsVar, izs<? super List<String>, s3q0> izsVar) {
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        permissionHelper.d(context, PermissionHelper.y, z ? R.string.vk_permissions_contacts_sync : -1, R.string.vk_permissions_contacts_sync_settings, new ncg(gzsVar, 11), new zq0(izsVar, 2));
    }

    @Override // com.vk.contacts.ContactsManager
    public final AndroidContact Q0(Uri uri) throws NoReadContactsPermissionException {
        u62 u62Var = e;
        if (u62Var == null) {
            u62Var = null;
        }
        Context context = u62Var.a;
        if (!enj.l(context, "android.permission.READ_CONTACTS")) {
            throw new NoReadContactsPermissionException();
        }
        Cursor b2 = vkj.b(context.getContentResolver(), Uri.withAppendedPath(uri, "data"), u62.c, "mimetype='vnd.android.cursor.item/phone_v2'", null, null, 0, 0, 248);
        if (b2 != null) {
            return (AndroidContact) fl3.i(b2, new oa(u62Var));
        }
        return null;
    }

    @Override // com.vk.contacts.ContactsManager
    public final synchronized Future T0(long j2, boolean z) {
        StringBuilder sb = new StringBuilder("requestContactsSync: force=");
        sb.append(z);
        sb.append(", delayMs=");
        sb.append(j2);
        sb.append(", hasPermission=");
        sb.append(b());
        sb.append(", isLoggedIn=");
        b25 b25Var = n;
        b25 b25Var2 = null;
        if (b25Var == null) {
            b25Var = null;
        }
        sb.append(b25Var.b());
        L.e("VkContactManager", sb.toString());
        if (!b()) {
            return CompletableFuture.completedFuture(new ContactsManager.b(ContactSyncState.NOT_PERMITTED));
        }
        b25 b25Var3 = n;
        if (b25Var3 != null) {
            b25Var2 = b25Var3;
        }
        if (!b25Var2.b()) {
            return CompletableFuture.completedFuture(new ContactsManager.b(ContactSyncState.NOT_PERMITTED));
        }
        Future future = d;
        if (future != null && e(future) && z) {
            future = l();
        } else if (future == null || e(future) || !z) {
            if (future != null && e(future)) {
                future = k(j2);
            } else if (future == null || e(future)) {
                future = (future == null && z) ? l() : k(j2);
            }
        }
        return future;
    }

    @Override // com.vk.contacts.ContactsManager
    public final synchronized Future<ContactsManager.b> U0() {
        I0(true);
        if (b()) {
            return super.K0(true);
        }
        return CompletableFuture.completedFuture(new ContactsManager.b(ContactSyncState.NOT_PERMITTED));
    }

    @Override // com.vk.contacts.ContactsManager
    public final void V0(boolean z) throws VKApiExecutionException, VKApiException {
        StringBuilder sb = new StringBuilder("clearContacts writePermission=");
        Context context = h;
        if (context == null) {
            context = null;
        }
        sb.append(enj.l(context, "android.permission.WRITE_CONTACTS"));
        L.e("VkContactManager", sb.toString());
        y62 y62Var = g;
        if (y62Var == null) {
            y62Var = null;
        }
        y62Var.a();
        if (z) {
            bay bayVar = f;
            if (bayVar == null) {
                bayVar = null;
            }
            bayVar.getClass();
            a1w a1wVar = q1w.a;
            (a1wVar != null ? a1wVar : null).n(bayVar, new j8j());
        }
        h(false);
        I0(false);
        L.e("VkContactManager", "notifyContactsCleared");
        j.onNext(uaj.a);
        i(ContactSyncState.NOT_PERMITTED);
    }

    @Override // com.vk.contacts.ContactsManager
    public final void W0(AndroidContact androidContact) {
        y62 y62Var = g;
        if (y62Var == null) {
            y62Var = null;
        }
        y62Var.d(Collections.singletonList(androidContact));
    }

    @Override // com.vk.contacts.ContactsManager
    public final void X0(long j2) {
        b25 b25Var = n;
        if (b25Var == null) {
            b25Var = null;
        }
        if (b25Var.b()) {
            f fVar = i;
            if (fVar == null) {
                fVar = null;
            }
            Long valueOf = Long.valueOf(j2);
            fVar.getClass();
            qaj0.c(f.c(), "key_contacts_last_update_time", valueOf);
            L l2 = L.a;
            l2.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.LogType logType = L.LogType.d;
            StringBuilder b2 = fp.b(j2, "saveLastContactsUpdateTime ", " uid=");
            b25 b25Var2 = n;
            b2.append((b25Var2 != null ? b25Var2 : null).c());
            b2.append(' ');
            L.u(l2, logType, new Object[]{"getDiff", b2.toString()});
        }
    }

    @Override // com.vk.contacts.ContactsManager
    public final Map<Long, AndroidContact> Y0(ContactsSource contactsSource) throws NoReadContactsPermissionException {
        int i2 = C0729c.$EnumSwitchMapping$0[contactsSource.ordinal()];
        if (i2 == 1) {
            y62 y62Var = g;
            return (y62Var != null ? y62Var : null).c();
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        u62 u62Var = e;
        return (u62Var != null ? u62Var : null).b();
    }

    @Override // com.vk.contacts.ContactsManager
    public final q<daj> a() {
        return j.a0(asu0.a.c());
    }

    public final synchronized void c(final a aVar) {
        if (k) {
            throw new IllegalStateException("ContactManager has already initialized");
        }
        o = aVar.j;
        h = aVar.a;
        e = aVar.h;
        f = aVar.c;
        g = aVar.g;
        l = aVar.e;
        m = aVar.f;
        b25 b25Var = aVar.b;
        n = b25Var;
        b25 b25Var2 = null;
        if (b25Var == null) {
            b25Var = null;
        }
        b25Var.b0(new b25.a() { // from class: xsna.ybj
            @Override // xsna.b25.a
            public final void d(tbu0 tbu0Var) {
                c.a.this.f.execute(new Runnable() { // from class: xsna.wbj
                    @Override // java.lang.Runnable
                    public final void run() {
                        b25 b25Var3 = com.vk.contacts.c.n;
                        if (b25Var3 == null) {
                            b25Var3 = null;
                        }
                        if (b25Var3.b()) {
                            com.vk.contacts.f fVar = com.vk.contacts.c.i;
                            if (fVar == null) {
                                fVar = null;
                            }
                            fVar.getClass();
                            SharedPreferences sharedPreferences = com.vk.contacts.f.e;
                            long j2 = sharedPreferences.getLong("last_logged_in_id", 0L);
                            b25 b25Var4 = com.vk.contacts.c.n;
                            if (b25Var4 == null) {
                                b25Var4 = null;
                            }
                            long j3 = b25Var4.c().b;
                            if (j2 != j3) {
                                L.e("VkContactManager", qlb0.a(j3, "Logged In to another user ", " let's clear cache"));
                                com.vk.contacts.f fVar2 = com.vk.contacts.c.i;
                                if (fVar2 == null) {
                                    fVar2 = null;
                                }
                                fVar2.getClass();
                                sharedPreferences.edit().putLong("last_logged_in_id", j3).apply();
                                y62 y62Var = com.vk.contacts.c.g;
                                (y62Var != null ? y62Var : null).a();
                            }
                        }
                    }
                });
            }
        });
        f fVar = f.a;
        Context context = h;
        if (context == null) {
            context = null;
        }
        b25 b25Var3 = n;
        if (b25Var3 != null) {
            b25Var2 = b25Var3;
        }
        io.reactivex.rxjava3.subjects.f<daj> fVar2 = j;
        f.c = context;
        f.b = fVar2;
        f.d = b25Var2;
        b25Var2.b0(new tej());
        i = fVar;
        k = true;
        d.a = this;
        aVar.i.subscribe(new acj(new zbj(0), 0));
        if (!b()) {
            i(ContactSyncState.NOT_PERMITTED);
        }
    }

    @Override // com.vk.contacts.ContactsManager
    public final synchronized ContactsManager.b d() {
        ContactsManager.b bVar;
        try {
            L.e("VkContactManager", "syncContacts: sync=" + d);
            Future<ContactsManager.b> future = d;
            if (future != null && !e(future)) {
                bVar = future.get();
            }
            bVar = (ContactsManager.b) l().get();
        } catch (Throwable th) {
            throw th;
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.vk.contacts.f] */
    public final ContactsManager.b m(boolean z) {
        boolean z2;
        AndroidContact androidContact;
        L.e("VkContactManager", "syncContactsImpl: ignoreNextSync=" + c + ", hasPermission=" + b());
        ContactSyncState contactSyncState = c ? ContactSyncState.HIDDEN : !o.invoke().booleanValue() ? ContactSyncState.DONE : !b() ? ContactSyncState.NOT_PERMITTED : null;
        if (contactSyncState != null) {
            return new ContactsManager.b(contactSyncState);
        }
        boolean z3 = false;
        if (z) {
            bay bayVar = f;
            if (bayVar == null) {
                bayVar = null;
            }
            bayVar.getClass();
            a1w a1wVar = q1w.a;
            if (a1wVar == null) {
                a1wVar = null;
            }
            a1wVar.n(bayVar, new cbj(0));
        }
        u62 u62Var = e;
        if (u62Var == null) {
            u62Var = null;
        }
        LinkedHashMap b2 = u62Var.b();
        y62 y62Var = g;
        if (y62Var == null) {
            y62Var = null;
        }
        HashMap c2 = y62Var.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = c2.keySet().iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            if (b2.get(Long.valueOf(longValue)) == null && (androidContact = (AndroidContact) c2.get(Long.valueOf(longValue))) != null) {
                linkedHashMap.put(Long.valueOf(longValue), androidContact);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = b2.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            long longValue2 = ((Number) it2.next()).longValue();
            boolean z4 = c2.get(Long.valueOf(longValue2)) != null;
            z2 = z4 && !epx.f(c2.get(Long.valueOf(longValue2)), b2.get(Long.valueOf(longValue2)));
            if (!z4 || z2) {
                AndroidContact androidContact2 = (AndroidContact) b2.get(Long.valueOf(longValue2));
                if (androidContact2 != null) {
                    linkedHashMap2.put(Long.valueOf(longValue2), androidContact2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (linkedHashMap.isEmpty() && linkedHashMap2.isEmpty()) {
            L.e("VkContactManager", "syncContactsImpl ignore sync - nothing changed");
        } else {
            i(ContactSyncState.SYNCING);
            try {
                L.e("VkContactManager", "contactsToDelete :" + linkedHashMap);
                bay bayVar2 = f;
                if (bayVar2 == null) {
                    bayVar2 = null;
                }
                bayVar2.getClass();
                try {
                    a1w a1wVar2 = q1w.a;
                    if (a1wVar2 == null) {
                        a1wVar2 = null;
                    }
                    Iterator it3 = ((List) vdg0.c(a1wVar2.n(bayVar2, new q8j(linkedHashMap.values(), z2)))).iterator();
                    while (it3.hasNext()) {
                        arrayList.add(Long.valueOf(((Number) it3.next()).longValue()));
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("deletedContacts : ");
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((Number) it4.next()).longValue() + " \n");
                    }
                    sb.append(arrayList3);
                    L.e("VkContactManager", sb.toString());
                    y62 y62Var2 = g;
                    if (y62Var2 == null) {
                        y62Var2 = null;
                    }
                    y62Var2.b(linkedHashMap.keySet());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("contactsToImport : ");
                    Set keySet = linkedHashMap2.keySet();
                    ArrayList arrayList4 = new ArrayList(c5g.u(keySet, 10));
                    Iterator it5 = keySet.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(String.valueOf(((Number) it5.next()).longValue()));
                    }
                    sb2.append(arrayList4);
                    L.e("VkContactManager", sb2.toString());
                    bay bayVar3 = f;
                    if (bayVar3 == null) {
                        bayVar3 = null;
                    }
                    bayVar3.getClass();
                    try {
                        a1w a1wVar3 = q1w.a;
                        if (a1wVar3 == null) {
                            a1wVar3 = null;
                        }
                        Iterator it6 = ((List) vdg0.c(a1wVar3.n(bayVar3, new q8j(linkedHashMap2.values(), z3)))).iterator();
                        while (it6.hasNext()) {
                            arrayList2.add(Long.valueOf(((Number) it6.next()).longValue()));
                        }
                        L.e("VkContactManager", "syncedContacts : " + arrayList2);
                        h(true);
                    } catch (Exception e2) {
                        if (e2 instanceof ImTaskExecutionException) {
                            throw ((ImTaskExecutionException) e2).getCause();
                        }
                        throw e2;
                    }
                } catch (Exception e3) {
                    if (e3 instanceof ImTaskExecutionException) {
                        throw ((ImTaskExecutionException) e3).getCause();
                    }
                    throw e3;
                }
            } catch (VKApiExecutionException e4) {
                com.vk.metrics.eventtracking.b.a.m(Integer.valueOf(e4.s()), "error_im_contacts_sync", "error");
                if (BuildInfo.e()) {
                    Context context = h;
                    if (context == null) {
                        context = null;
                    }
                    enj.r(context, "Contact Sync error. Please, send logs", 0);
                }
                int s = e4.s();
                if (s == 9) {
                    if (!arrayList.isEmpty()) {
                        f(arrayList);
                    }
                    i(ContactSyncState.DONE);
                    c = true;
                } else {
                    if (s != 937) {
                        ContactSyncState contactSyncState2 = ContactSyncState.FAILED;
                        i(contactSyncState2);
                        Context context2 = h;
                        Context context3 = context2 == null ? null : context2;
                        if (context2 == null) {
                            context2 = null;
                        }
                        enj.r(context3, context2.getString(R.string.sync_contacts_failed), 0);
                        if (!L0()) {
                            ?? r1 = i;
                            (r1 != 0 ? r1 : null).getClass();
                            f.d(false);
                        }
                        return new ContactsManager.b(contactSyncState2);
                    }
                    if (!arrayList.isEmpty()) {
                        f(arrayList);
                    }
                    i(ContactSyncState.DONE);
                    c = true;
                }
            }
            LinkedHashSet d0 = j5g.d0(arrayList, arrayList2);
            arrayList.removeAll(d0);
            arrayList2.removeAll(d0);
            if (!arrayList.isEmpty()) {
                f(arrayList);
            }
            y62 y62Var3 = g;
            (y62Var3 != null ? y62Var3 : null).d(linkedHashMap2.values());
            if (!linkedHashMap2.isEmpty()) {
                int size = linkedHashMap2.size();
                L.e("VkContactManager", "notifyContactsImported newSyncedContactIds: " + arrayList2 + ", totalUploaded: " + size);
                j.onNext(new fbj(arrayList2, size));
            }
            Thread.sleep(500L);
            i(ContactSyncState.DONE);
        }
        return new ContactsManager.b(ContactSyncState.DONE, arrayList2, arrayList);
    }
}
