package com.vk.contacts;

import android.content.Context;
import android.net.Uri;
import com.vk.contacts.model.ContactsPermissionMessage;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.NotImplementedError;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.daj;
import xsna.epx;
import xsna.fw3;
import xsna.gzs;
import xsna.izs;
import xsna.jgp;
import xsna.ms9;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: ContactsManager.kt */
/* loaded from: classes.dex */
public interface ContactsManager {
    public static final a a = a.a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContactsManager.kt */
    /* loaded from: classes17.dex */
    public static final class BottomSheetBehaviour {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BottomSheetBehaviour[] $VALUES;
        public static final BottomSheetBehaviour Always;
        public static final BottomSheetBehaviour WhenPermissionDenied;

        static {
            BottomSheetBehaviour bottomSheetBehaviour = new BottomSheetBehaviour("Always", 0);
            Always = bottomSheetBehaviour;
            BottomSheetBehaviour bottomSheetBehaviour2 = new BottomSheetBehaviour("WhenPermissionDenied", 1);
            WhenPermissionDenied = bottomSheetBehaviour2;
            BottomSheetBehaviour[] bottomSheetBehaviourArr = {bottomSheetBehaviour, bottomSheetBehaviour2};
            $VALUES = bottomSheetBehaviourArr;
            $ENTRIES = new asp(bottomSheetBehaviourArr);
        }

        public BottomSheetBehaviour() {
            throw null;
        }

        public static BottomSheetBehaviour valueOf(String str) {
            return (BottomSheetBehaviour) Enum.valueOf(BottomSheetBehaviour.class, str);
        }

        public static BottomSheetBehaviour[] values() {
            return (BottomSheetBehaviour[]) $VALUES.clone();
        }
    }

    static /* synthetic */ void R0(ContactsManager contactsManager, Context context, boolean z, ContactsPermissionMessage contactsPermissionMessage, izs izsVar, gzs gzsVar, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            contactsPermissionMessage = ContactsPermissionMessage.DEFAULT;
        }
        contactsManager.N0(context, z2, contactsPermissionMessage, null, (i & 16) != 0 ? null : izsVar, (i & 32) != 0 ? null : gzsVar);
    }

    default ContactSyncState G0() {
        return ContactSyncState.UNSUPPORTED;
    }

    default boolean H0() {
        return false;
    }

    default void J0(Context context, BottomSheetBehaviour bottomSheetBehaviour, boolean z, ContactsPermissionMessage contactsPermissionMessage, gzs<s3q0> gzsVar, izs<? super List<String>, s3q0> izsVar, gzs<s3q0> gzsVar2) {
        throw new NotImplementedError();
    }

    default Future<b> K0(boolean z) {
        return T0(TimeUnit.SECONDS.toMillis(10L), z);
    }

    default boolean L0() {
        return false;
    }

    default void N0(Context context, boolean z, ContactsPermissionMessage contactsPermissionMessage, gzs<s3q0> gzsVar, izs<? super List<String>, s3q0> izsVar, gzs<s3q0> gzsVar2) {
        J0(context, BottomSheetBehaviour.Always, z, contactsPermissionMessage, gzsVar, izsVar, gzsVar2);
    }

    default Long O0() {
        return null;
    }

    default AndroidContact Q0(Uri uri) throws NoReadContactsPermissionException {
        return null;
    }

    default void S0(Context context, ContactsPermissionMessage contactsPermissionMessage) {
        R0(this, context, false, contactsPermissionMessage, null, null, 56);
    }

    default Future T0(long j, boolean z) {
        return CompletableFuture.completedFuture(new b(ContactSyncState.UNSUPPORTED));
    }

    default Future<b> U0() {
        return K0(true);
    }

    default Map<Long, AndroidContact> Y0(ContactsSource contactsSource) throws NoReadContactsPermissionException {
        return jgp.b;
    }

    default q<daj> a() {
        return g0.b;
    }

    default b d() {
        return new b(ContactSyncState.UNSUPPORTED);
    }

    /* compiled from: ContactsManager.kt */
    public static final class b {
        public final ContactSyncState a;
        public final List<Long> b;
        public final List<Long> c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(ContactSyncState contactSyncState) {
            this(contactSyncState, r0, r0);
            EmptyList emptyList = EmptyList.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SyncResult(state=");
            sb.append(this.a);
            sb.append(", syncedContactIds=");
            sb.append(this.b);
            sb.append(", deletedContactIds=");
            return ms9.a(')', sb, this.c);
        }

        public b(ContactSyncState contactSyncState, List<Long> list, List<Long> list2) {
            this.a = contactSyncState;
            this.b = list;
            this.c = list2;
        }
    }

    /* compiled from: ContactsManager.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ContactsManager STUB = new C0725a();

        public final ContactsManager getSTUB() {
            return STUB;
        }

        /* compiled from: ContactsManager.kt */
        /* renamed from: com.vk.contacts.ContactsManager$a$a, reason: collision with other inner class name */
        public static final class C0725a implements ContactsManager {
            @Override // com.vk.contacts.ContactsManager
            public final ContactSyncState G0() {
                return ContactSyncState.UNSUPPORTED;
            }

            @Override // com.vk.contacts.ContactsManager
            public final boolean H0() {
                return false;
            }

            @Override // com.vk.contacts.ContactsManager
            public final void J0(Context context, BottomSheetBehaviour bottomSheetBehaviour, boolean z, ContactsPermissionMessage contactsPermissionMessage, gzs<s3q0> gzsVar, izs<? super List<String>, s3q0> izsVar, gzs<s3q0> gzsVar2) {
                super.J0(context, bottomSheetBehaviour, z, contactsPermissionMessage, gzsVar, izsVar, gzsVar2);
                throw null;
            }

            @Override // com.vk.contacts.ContactsManager
            public final boolean L0() {
                return false;
            }

            @Override // com.vk.contacts.ContactsManager
            public final Long O0() {
                return null;
            }

            @Override // com.vk.contacts.ContactsManager
            public final AndroidContact Q0(Uri uri) throws NoReadContactsPermissionException {
                return null;
            }

            @Override // com.vk.contacts.ContactsManager
            public final Future<b> U0() {
                return super.K0(true);
            }

            @Override // com.vk.contacts.ContactsManager
            public final Map<Long, AndroidContact> Y0(ContactsSource contactsSource) throws NoReadContactsPermissionException {
                return jgp.b;
            }

            @Override // com.vk.contacts.ContactsManager
            public final q<daj> a() {
                return g0.b;
            }

            @Override // com.vk.contacts.ContactsManager
            public final void I0(boolean z) {
            }

            @Override // com.vk.contacts.ContactsManager
            public final void M0(Collection<Long> collection) {
            }

            @Override // com.vk.contacts.ContactsManager
            public final void V0(boolean z) {
            }

            @Override // com.vk.contacts.ContactsManager
            public final void W0(AndroidContact androidContact) {
            }

            @Override // com.vk.contacts.ContactsManager
            public final void X0(long j) {
            }

            @Override // com.vk.contacts.ContactsManager
            public final void P0(Context context, boolean z, gzs<s3q0> gzsVar, izs<? super List<String>, s3q0> izsVar) {
            }
        }
    }

    default void I0(boolean z) {
    }

    default void M0(Collection<Long> collection) {
    }

    default void V0(boolean z) {
    }

    default void W0(AndroidContact androidContact) {
    }

    default void X0(long j) {
    }

    default void P0(Context context, boolean z, gzs<s3q0> gzsVar, izs<? super List<String>, s3q0> izsVar) {
    }
}
