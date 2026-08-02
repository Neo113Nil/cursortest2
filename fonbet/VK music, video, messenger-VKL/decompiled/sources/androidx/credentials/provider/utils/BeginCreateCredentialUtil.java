package androidx.credentials.provider.utils;

import android.annotation.SuppressLint;
import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.CallingAppInfo;
import androidx.credentials.provider.BeginCreateCredentialRequest;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.CreateEntry;
import androidx.credentials.provider.RemoteEntry;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import xsna.cb1;
import xsna.e81;
import xsna.eb1;
import xsna.fb1;
import xsna.gb1;
import xsna.hb1;
import xsna.izs;
import xsna.o92;
import xsna.p92;
import xsna.q92;
import xsna.sw6;
import xsna.tw6;
import xsna.zcl;

/* compiled from: BeginCreateCredentialUtil.kt */
/* loaded from: classes12.dex */
public final class BeginCreateCredentialUtil {
    public static final Companion Companion = new Companion(null);

    /* compiled from: BeginCreateCredentialUtil.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CreateEntry convertToJetpackResponse$lambda$2(izs izsVar, Object obj) {
            return (CreateEntry) izsVar.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$3(izs izsVar, Object obj) {
            return ((Boolean) izsVar.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CreateEntry convertToJetpackResponse$lambda$4(izs izsVar, Object obj) {
            return (CreateEntry) izsVar.invoke(obj);
        }

        private final void populateCreateEntries(BeginCreateCredentialResponse.Builder builder, List<CreateEntry> list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Slice slice = CreateEntry.Companion.toSlice((CreateEntry) it.next());
                if (slice != null) {
                    builder.addCreateEntry(p92.g(slice));
                }
            }
        }

        @SuppressLint({"MissingPermission"})
        private final void populateRemoteEntry(BeginCreateCredentialResponse.Builder builder, RemoteEntry remoteEntry) {
            if (remoteEntry == null) {
                return;
            }
            cb1.g();
            builder.setRemoteCreateEntry(o92.e(RemoteEntry.Companion.toSlice(remoteEntry)));
        }

        public final BeginCreateCredentialRequest convertToFrameworkRequest(androidx.credentials.provider.BeginCreateCredentialRequest beginCreateCredentialRequest) {
            CallingAppInfo callingAppInfo;
            if (beginCreateCredentialRequest.getCallingAppInfo() != null) {
                gb1.f();
                callingAppInfo = eb1.e(beginCreateCredentialRequest.getCallingAppInfo().getPackageName(), beginCreateCredentialRequest.getCallingAppInfo().getSigningInfo(), beginCreateCredentialRequest.getCallingAppInfo().getOrigin$credentials_release());
            } else {
                callingAppInfo = null;
            }
            hb1.i();
            return fb1.g(beginCreateCredentialRequest.getType(), beginCreateCredentialRequest.getCandidateQueryData(), callingAppInfo);
        }

        public final BeginCreateCredentialResponse convertToFrameworkResponse(androidx.credentials.provider.BeginCreateCredentialResponse beginCreateCredentialResponse) {
            BeginCreateCredentialResponse build;
            BeginCreateCredentialResponse.Builder d = q92.d();
            populateCreateEntries(d, beginCreateCredentialResponse.getCreateEntries());
            populateRemoteEntry(d, beginCreateCredentialResponse.getRemoteEntry());
            build = d.build();
            return build;
        }

        public final androidx.credentials.provider.BeginCreateCredentialRequest convertToJetpackRequest$credentials_release(BeginCreateCredentialRequest beginCreateCredentialRequest) {
            String type;
            Bundle data;
            CallingAppInfo callingAppInfo;
            androidx.credentials.provider.CallingAppInfo callingAppInfo2;
            String packageName;
            SigningInfo signingInfo;
            String origin;
            BeginCreateCredentialRequest.Companion companion = androidx.credentials.provider.BeginCreateCredentialRequest.Companion;
            type = beginCreateCredentialRequest.getType();
            data = beginCreateCredentialRequest.getData();
            callingAppInfo = beginCreateCredentialRequest.getCallingAppInfo();
            if (callingAppInfo != null) {
                CallingAppInfo.Companion companion2 = androidx.credentials.provider.CallingAppInfo.Companion;
                packageName = callingAppInfo.getPackageName();
                signingInfo = callingAppInfo.getSigningInfo();
                origin = callingAppInfo.getOrigin();
                callingAppInfo2 = companion2.create(packageName, signingInfo, origin);
            } else {
                callingAppInfo2 = null;
            }
            return companion.createFrom$credentials_release(type, data, callingAppInfo2);
        }

        public final androidx.credentials.provider.BeginCreateCredentialResponse convertToJetpackResponse(BeginCreateCredentialResponse beginCreateCredentialResponse) {
            List createEntries;
            android.service.credentials.RemoteEntry remoteCreateEntry;
            RemoteEntry remoteEntry;
            Slice slice;
            createEntries = beginCreateCredentialResponse.getCreateEntries();
            int i = 0;
            Stream filter = createEntries.stream().map(new sw6(new izs<android.service.credentials.CreateEntry, CreateEntry>() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$convertToJetpackResponse$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final CreateEntry invoke2(android.service.credentials.CreateEntry createEntry) {
                    Slice slice2;
                    CreateEntry.Companion companion = CreateEntry.Companion;
                    slice2 = createEntry.getSlice();
                    return companion.fromSlice(slice2);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ CreateEntry invoke(android.service.credentials.CreateEntry createEntry) {
                    return invoke2(e81.g(createEntry));
                }
            }, i)).filter(new tw6(new izs<CreateEntry, Boolean>() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$convertToJetpackResponse$2
                @Override // xsna.izs
                public final Boolean invoke(CreateEntry createEntry) {
                    return Boolean.valueOf(createEntry != null);
                }
            }, i));
            final BeginCreateCredentialUtil$Companion$convertToJetpackResponse$3 beginCreateCredentialUtil$Companion$convertToJetpackResponse$3 = new izs<CreateEntry, CreateEntry>() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$convertToJetpackResponse$3
                @Override // xsna.izs
                public final CreateEntry invoke(CreateEntry createEntry) {
                    return createEntry;
                }
            };
            List list = (List) filter.map(new Function() { // from class: xsna.uw6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    CreateEntry convertToJetpackResponse$lambda$4;
                    convertToJetpackResponse$lambda$4 = BeginCreateCredentialUtil.Companion.convertToJetpackResponse$lambda$4(izs.this, obj);
                    return convertToJetpackResponse$lambda$4;
                }
            }).collect(Collectors.toList());
            remoteCreateEntry = beginCreateCredentialResponse.getRemoteCreateEntry();
            if (remoteCreateEntry != null) {
                RemoteEntry.Companion companion = RemoteEntry.Companion;
                slice = remoteCreateEntry.getSlice();
                remoteEntry = companion.fromSlice(slice);
            } else {
                remoteEntry = null;
            }
            return new androidx.credentials.provider.BeginCreateCredentialResponse(list, remoteEntry);
        }

        private Companion() {
        }
    }
}
