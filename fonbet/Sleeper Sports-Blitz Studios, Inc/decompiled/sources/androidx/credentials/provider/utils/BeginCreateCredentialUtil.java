package androidx.credentials.provider.utils;

import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.CallingAppInfo;
import androidx.credentials.provider.Action$Companion$$ExternalSyntheticApiModelOutline0;
import androidx.credentials.provider.BeginCreateCredentialRequest;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.CreateEntry;
import androidx.credentials.provider.RemoteEntry;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import io.sentry.protocol.Response;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeginCreateCredentialUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/utils/BeginCreateCredentialUtil;", "", "()V", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BeginCreateCredentialUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: BeginCreateCredentialUtil.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0003J\u001a\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0003¨\u0006\u0019"}, d2 = {"Landroidx/credentials/provider/utils/BeginCreateCredentialUtil$Companion;", "", "()V", "convertToFrameworkRequest", "Landroid/service/credentials/BeginCreateCredentialRequest;", "request", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "convertToFrameworkResponse", "Landroid/service/credentials/BeginCreateCredentialResponse;", Response.TYPE, "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "convertToJetpackRequest", "convertToJetpackRequest$credentials_release", "convertToJetpackResponse", "frameworkResponse", "populateCreateEntries", "", "frameworkBuilder", "Landroid/service/credentials/BeginCreateCredentialResponse$Builder;", "createEntries", "", "Landroidx/credentials/provider/CreateEntry;", "populateRemoteEntry", "remoteEntry", "Landroidx/credentials/provider/RemoteEntry;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BeginCreateCredentialRequest convertToJetpackRequest$credentials_release(android.service.credentials.BeginCreateCredentialRequest request) {
            String type;
            Bundle data;
            CallingAppInfo callingAppInfo;
            androidx.credentials.provider.CallingAppInfo callingAppInfo2;
            String packageName;
            SigningInfo signingInfo;
            String origin;
            Intrinsics.checkNotNullParameter(request, "request");
            BeginCreateCredentialRequest.Companion companion = BeginCreateCredentialRequest.INSTANCE;
            type = request.getType();
            Intrinsics.checkNotNullExpressionValue(type, "request.type");
            data = request.getData();
            Intrinsics.checkNotNullExpressionValue(data, "request.data");
            callingAppInfo = request.getCallingAppInfo();
            if (callingAppInfo != null) {
                CallingAppInfo.Companion companion2 = androidx.credentials.provider.CallingAppInfo.INSTANCE;
                packageName = callingAppInfo.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "it.packageName");
                signingInfo = callingAppInfo.getSigningInfo();
                Intrinsics.checkNotNullExpressionValue(signingInfo, "it.signingInfo");
                origin = callingAppInfo.getOrigin();
                callingAppInfo2 = companion2.create(packageName, signingInfo, origin);
            } else {
                callingAppInfo2 = null;
            }
            return companion.createFrom$credentials_release(type, data, callingAppInfo2);
        }

        public final BeginCreateCredentialResponse convertToFrameworkResponse(androidx.credentials.provider.BeginCreateCredentialResponse response) {
            BeginCreateCredentialResponse build;
            Intrinsics.checkNotNullParameter(response, "response");
            BeginCreateCredentialResponse.Builder m = Action$Companion$$ExternalSyntheticApiModelOutline0.m();
            populateCreateEntries(m, response.getCreateEntries());
            populateRemoteEntry(m, response.getRemoteEntry());
            build = m.build();
            Intrinsics.checkNotNullExpressionValue(build, "frameworkBuilder.build()");
            return build;
        }

        private final void populateRemoteEntry(BeginCreateCredentialResponse.Builder frameworkBuilder, RemoteEntry remoteEntry) {
            if (remoteEntry == null) {
                return;
            }
            Action$Companion$$ExternalSyntheticApiModelOutline0.m$7();
            frameworkBuilder.setRemoteCreateEntry(Action$Companion$$ExternalSyntheticApiModelOutline0.m9218m(RemoteEntry.INSTANCE.toSlice(remoteEntry)));
        }

        private final void populateCreateEntries(BeginCreateCredentialResponse.Builder frameworkBuilder, List<CreateEntry> createEntries) {
            Iterator<T> it = createEntries.iterator();
            while (it.hasNext()) {
                Slice slice = CreateEntry.INSTANCE.toSlice((CreateEntry) it.next());
                if (slice != null) {
                    frameworkBuilder.addCreateEntry(Action$Companion$$ExternalSyntheticApiModelOutline0.m(slice));
                }
            }
        }

        public final android.service.credentials.BeginCreateCredentialRequest convertToFrameworkRequest(BeginCreateCredentialRequest request) {
            android.service.credentials.CallingAppInfo callingAppInfo;
            Intrinsics.checkNotNullParameter(request, "request");
            if (request.getCallingAppInfo() != null) {
                Action$Companion$$ExternalSyntheticApiModelOutline0.m$9();
                callingAppInfo = Action$Companion$$ExternalSyntheticApiModelOutline0.m(request.getCallingAppInfo().getPackageName(), request.getCallingAppInfo().getSigningInfo(), request.getCallingAppInfo().getOrigin());
            } else {
                callingAppInfo = null;
            }
            Action$Companion$$ExternalSyntheticApiModelOutline0.m$8();
            return Action$Companion$$ExternalSyntheticApiModelOutline0.m(request.getType(), request.getCandidateQueryData(), callingAppInfo);
        }

        public final androidx.credentials.provider.BeginCreateCredentialResponse convertToJetpackResponse(BeginCreateCredentialResponse frameworkResponse) {
            List createEntries;
            android.service.credentials.RemoteEntry remoteCreateEntry;
            RemoteEntry remoteEntry;
            Slice slice;
            Intrinsics.checkNotNullParameter(frameworkResponse, "frameworkResponse");
            createEntries = frameworkResponse.getCreateEntries();
            Stream stream = createEntries.stream();
            final BeginCreateCredentialUtil$Companion$convertToJetpackResponse$1 beginCreateCredentialUtil$Companion$convertToJetpackResponse$1 = new Function1<android.service.credentials.CreateEntry, CreateEntry>() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$convertToJetpackResponse$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final CreateEntry invoke2(android.service.credentials.CreateEntry createEntry) {
                    Slice slice2;
                    CreateEntry.Companion companion = CreateEntry.INSTANCE;
                    slice2 = createEntry.getSlice();
                    Intrinsics.checkNotNullExpressionValue(slice2, "entry.slice");
                    return companion.fromSlice(slice2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ CreateEntry invoke(android.service.credentials.CreateEntry createEntry) {
                    return invoke2(Action$Companion$$ExternalSyntheticApiModelOutline0.m9217m((Object) createEntry));
                }
            };
            Stream map = stream.map(new Function() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda20
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    CreateEntry convertToJetpackResponse$lambda$2;
                    convertToJetpackResponse$lambda$2 = BeginCreateCredentialUtil.Companion.convertToJetpackResponse$lambda$2(Function1.this, obj);
                    return convertToJetpackResponse$lambda$2;
                }
            });
            final BeginCreateCredentialUtil$Companion$convertToJetpackResponse$2 beginCreateCredentialUtil$Companion$convertToJetpackResponse$2 = new Function1<CreateEntry, Boolean>() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$convertToJetpackResponse$2
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(CreateEntry createEntry) {
                    return Boolean.valueOf(createEntry != null);
                }
            };
            Stream filter = map.filter(new Predicate() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda21
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean convertToJetpackResponse$lambda$3;
                    convertToJetpackResponse$lambda$3 = BeginCreateCredentialUtil.Companion.convertToJetpackResponse$lambda$3(Function1.this, obj);
                    return convertToJetpackResponse$lambda$3;
                }
            });
            final BeginCreateCredentialUtil$Companion$convertToJetpackResponse$3 beginCreateCredentialUtil$Companion$convertToJetpackResponse$3 = new Function1<CreateEntry, CreateEntry>() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$convertToJetpackResponse$3
                @Override // kotlin.jvm.functions.Function1
                public final CreateEntry invoke(CreateEntry createEntry) {
                    Intrinsics.checkNotNull(createEntry);
                    return createEntry;
                }
            };
            Object collect = filter.map(new Function() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda22
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    CreateEntry convertToJetpackResponse$lambda$4;
                    convertToJetpackResponse$lambda$4 = BeginCreateCredentialUtil.Companion.convertToJetpackResponse$lambda$4(Function1.this, obj);
                    return convertToJetpackResponse$lambda$4;
                }
            }).collect(Collectors.toList());
            Intrinsics.checkNotNullExpressionValue(collect, "frameworkResponse.create…lect(Collectors.toList())");
            List list = (List) collect;
            remoteCreateEntry = frameworkResponse.getRemoteCreateEntry();
            if (remoteCreateEntry != null) {
                RemoteEntry.Companion companion = RemoteEntry.INSTANCE;
                slice = remoteCreateEntry.getSlice();
                Intrinsics.checkNotNullExpressionValue(slice, "it.slice");
                remoteEntry = companion.fromSlice(slice);
            } else {
                remoteEntry = null;
            }
            return new androidx.credentials.provider.BeginCreateCredentialResponse(list, remoteEntry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CreateEntry convertToJetpackResponse$lambda$2(Function1 function1, Object obj) {
            return (CreateEntry) function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$3(Function1 function1, Object obj) {
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CreateEntry convertToJetpackResponse$lambda$4(Function1 function1, Object obj) {
            return (CreateEntry) function1.invoke(obj);
        }
    }
}
