package androidx.credentials.provider.utils;

import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.CallingAppInfo;
import androidx.credentials.provider.Action;
import androidx.credentials.provider.Action$Companion$$ExternalSyntheticApiModelOutline0;
import androidx.credentials.provider.AuthenticationAction;
import androidx.credentials.provider.BeginGetCredentialOption;
import androidx.credentials.provider.BeginGetCredentialRequest;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.CredentialEntry;
import androidx.credentials.provider.RemoteEntry;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import androidx.media3.common.util.Util$$ExternalSyntheticApiModelOutline0;
import io.sentry.protocol.Response;
import java.util.ArrayList;
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

/* compiled from: BeginGetCredentialUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/utils/BeginGetCredentialUtil;", "", "()V", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BeginGetCredentialUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: BeginGetCredentialUtil.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0010J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u001e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017H\u0002J\u001e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017H\u0002J\u001a\u0010 \u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"H\u0003¨\u0006#"}, d2 = {"Landroidx/credentials/provider/utils/BeginGetCredentialUtil$Companion;", "", "()V", "convertToFrameworkRequest", "Landroid/service/credentials/BeginGetCredentialRequest;", "request", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "convertToFrameworkResponse", "Landroid/service/credentials/BeginGetCredentialResponse;", Response.TYPE, "Landroidx/credentials/provider/BeginGetCredentialResponse;", "convertToJetpackBeginOption", "Landroid/service/credentials/BeginGetCredentialOption;", "option", "Landroidx/credentials/provider/BeginGetCredentialOption;", "convertToJetpackRequest", "convertToJetpackRequest$credentials_release", "convertToJetpackResponse", "populateActionEntries", "", "builder", "Landroid/service/credentials/BeginGetCredentialResponse$Builder;", "actionEntries", "", "Landroidx/credentials/provider/Action;", "populateAuthenticationEntries", "frameworkBuilder", "authenticationActions", "Landroidx/credentials/provider/AuthenticationAction;", "populateCredentialEntries", "credentialEntries", "Landroidx/credentials/provider/CredentialEntry;", "populateRemoteEntry", "remoteEntry", "Landroidx/credentials/provider/RemoteEntry;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BeginGetCredentialRequest convertToJetpackRequest$credentials_release(android.service.credentials.BeginGetCredentialRequest request) {
            List beginGetCredentialOptions;
            CallingAppInfo callingAppInfo;
            androidx.credentials.provider.CallingAppInfo callingAppInfo2;
            String packageName;
            SigningInfo signingInfo;
            String origin;
            String id;
            String type;
            Bundle candidateQueryData;
            Intrinsics.checkNotNullParameter(request, "request");
            ArrayList arrayList = new ArrayList();
            beginGetCredentialOptions = request.getBeginGetCredentialOptions();
            Intrinsics.checkNotNullExpressionValue(beginGetCredentialOptions, "request.beginGetCredentialOptions");
            Iterator it = beginGetCredentialOptions.iterator();
            while (it.hasNext()) {
                BeginGetCredentialOption m9352m = Util$$ExternalSyntheticApiModelOutline0.m9352m(it.next());
                BeginGetCredentialOption.Companion companion = androidx.credentials.provider.BeginGetCredentialOption.INSTANCE;
                id = m9352m.getId();
                Intrinsics.checkNotNullExpressionValue(id, "it.id");
                type = m9352m.getType();
                Intrinsics.checkNotNullExpressionValue(type, "it.type");
                candidateQueryData = m9352m.getCandidateQueryData();
                Intrinsics.checkNotNullExpressionValue(candidateQueryData, "it.candidateQueryData");
                arrayList.add(companion.createFrom$credentials_release(id, type, candidateQueryData));
            }
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
            return new BeginGetCredentialRequest(arrayList, callingAppInfo2);
        }

        public final BeginGetCredentialResponse convertToFrameworkResponse(androidx.credentials.provider.BeginGetCredentialResponse response) {
            BeginGetCredentialResponse build;
            Intrinsics.checkNotNullParameter(response, "response");
            BeginGetCredentialResponse.Builder m9214m = Action$Companion$$ExternalSyntheticApiModelOutline0.m9214m();
            populateCredentialEntries(m9214m, response.getCredentialEntries());
            populateActionEntries(m9214m, response.getActions());
            populateAuthenticationEntries(m9214m, response.getAuthenticationActions());
            populateRemoteEntry(m9214m, response.getRemoteEntry());
            build = m9214m.build();
            Intrinsics.checkNotNullExpressionValue(build, "frameworkBuilder.build()");
            return build;
        }

        private final void populateRemoteEntry(BeginGetCredentialResponse.Builder frameworkBuilder, RemoteEntry remoteEntry) {
            if (remoteEntry == null) {
                return;
            }
            Action$Companion$$ExternalSyntheticApiModelOutline0.m$7();
            frameworkBuilder.setRemoteCredentialEntry(Action$Companion$$ExternalSyntheticApiModelOutline0.m9218m(RemoteEntry.INSTANCE.toSlice(remoteEntry)));
        }

        private final void populateAuthenticationEntries(BeginGetCredentialResponse.Builder frameworkBuilder, List<AuthenticationAction> authenticationActions) {
            for (AuthenticationAction authenticationAction : authenticationActions) {
                Util$$ExternalSyntheticApiModelOutline0.m9361m();
                frameworkBuilder.addAuthenticationAction(Util$$ExternalSyntheticApiModelOutline0.m(AuthenticationAction.INSTANCE.toSlice(authenticationAction)));
            }
        }

        private final void populateActionEntries(BeginGetCredentialResponse.Builder builder, List<Action> actionEntries) {
            for (Action action : actionEntries) {
                Util$$ExternalSyntheticApiModelOutline0.m9361m();
                builder.addAction(Util$$ExternalSyntheticApiModelOutline0.m(Action.INSTANCE.toSlice(action)));
            }
        }

        private final void populateCredentialEntries(BeginGetCredentialResponse.Builder builder, List<? extends CredentialEntry> credentialEntries) {
            for (CredentialEntry credentialEntry : credentialEntries) {
                Slice slice$credentials_release = CredentialEntry.INSTANCE.toSlice$credentials_release(credentialEntry);
                if (slice$credentials_release != null) {
                    Util$$ExternalSyntheticApiModelOutline0.m$1();
                    Util$$ExternalSyntheticApiModelOutline0.m$2();
                    builder.addCredentialEntry(Util$$ExternalSyntheticApiModelOutline0.m(Util$$ExternalSyntheticApiModelOutline0.m(credentialEntry.getBeginGetCredentialOption().getId(), credentialEntry.getType(), Bundle.EMPTY), slice$credentials_release));
                }
            }
        }

        public final android.service.credentials.BeginGetCredentialRequest convertToFrameworkRequest(BeginGetCredentialRequest request) {
            BeginGetCredentialRequest.Builder beginGetCredentialOptions;
            android.service.credentials.BeginGetCredentialRequest build;
            Intrinsics.checkNotNullParameter(request, "request");
            BeginGetCredentialRequest.Builder m9353m = Util$$ExternalSyntheticApiModelOutline0.m9353m();
            if (request.getCallingAppInfo() != null) {
                Action$Companion$$ExternalSyntheticApiModelOutline0.m$9();
                m9353m.setCallingAppInfo(Action$Companion$$ExternalSyntheticApiModelOutline0.m(request.getCallingAppInfo().getPackageName(), request.getCallingAppInfo().getSigningInfo(), request.getCallingAppInfo().getOrigin()));
            }
            Stream<androidx.credentials.provider.BeginGetCredentialOption> stream = request.getBeginGetCredentialOptions().stream();
            final BeginGetCredentialUtil$Companion$convertToFrameworkRequest$1 beginGetCredentialUtil$Companion$convertToFrameworkRequest$1 = new Function1<androidx.credentials.provider.BeginGetCredentialOption, android.service.credentials.BeginGetCredentialOption>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToFrameworkRequest$1
                @Override // kotlin.jvm.functions.Function1
                public final android.service.credentials.BeginGetCredentialOption invoke(androidx.credentials.provider.BeginGetCredentialOption option) {
                    android.service.credentials.BeginGetCredentialOption convertToJetpackBeginOption;
                    BeginGetCredentialUtil.Companion companion = BeginGetCredentialUtil.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(option, "option");
                    convertToJetpackBeginOption = companion.convertToJetpackBeginOption(option);
                    return convertToJetpackBeginOption;
                }
            };
            beginGetCredentialOptions = m9353m.setBeginGetCredentialOptions((List) stream.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda35
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    android.service.credentials.BeginGetCredentialOption convertToFrameworkRequest$lambda$5;
                    convertToFrameworkRequest$lambda$5 = BeginGetCredentialUtil.Companion.convertToFrameworkRequest$lambda$5(Function1.this, obj);
                    return convertToFrameworkRequest$lambda$5;
                }
            }).collect(Collectors.toList()));
            build = beginGetCredentialOptions.build();
            Intrinsics.checkNotNullExpressionValue(build, "builder\n                …\n                .build()");
            return build;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final android.service.credentials.BeginGetCredentialOption convertToFrameworkRequest$lambda$5(Function1 function1, Object obj) {
            return Util$$ExternalSyntheticApiModelOutline0.m9352m(function1.invoke(obj));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.service.credentials.BeginGetCredentialOption convertToJetpackBeginOption(androidx.credentials.provider.BeginGetCredentialOption option) {
            Util$$ExternalSyntheticApiModelOutline0.m$2();
            return Util$$ExternalSyntheticApiModelOutline0.m(option.getId(), option.getType(), option.getCandidateQueryData());
        }

        public final androidx.credentials.provider.BeginGetCredentialResponse convertToJetpackResponse(BeginGetCredentialResponse response) {
            List credentialEntries;
            List actions;
            List authenticationActions;
            android.service.credentials.RemoteEntry remoteCredentialEntry;
            RemoteEntry remoteEntry;
            Slice slice;
            Intrinsics.checkNotNullParameter(response, "response");
            credentialEntries = response.getCredentialEntries();
            Stream stream = credentialEntries.stream();
            final BeginGetCredentialUtil$Companion$convertToJetpackResponse$1 beginGetCredentialUtil$Companion$convertToJetpackResponse$1 = new Function1<android.service.credentials.CredentialEntry, CredentialEntry>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final CredentialEntry invoke2(android.service.credentials.CredentialEntry credentialEntry) {
                    Slice slice2;
                    CredentialEntry.Companion companion = CredentialEntry.INSTANCE;
                    slice2 = credentialEntry.getSlice();
                    Intrinsics.checkNotNullExpressionValue(slice2, "entry.slice");
                    return companion.fromSlice$credentials_release(slice2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ CredentialEntry invoke(android.service.credentials.CredentialEntry credentialEntry) {
                    return invoke2(Util$$ExternalSyntheticApiModelOutline0.m9354m((Object) credentialEntry));
                }
            };
            Stream map = stream.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda28
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    CredentialEntry convertToJetpackResponse$lambda$6;
                    convertToJetpackResponse$lambda$6 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$6(Function1.this, obj);
                    return convertToJetpackResponse$lambda$6;
                }
            });
            final BeginGetCredentialUtil$Companion$convertToJetpackResponse$2 beginGetCredentialUtil$Companion$convertToJetpackResponse$2 = new Function1<CredentialEntry, Boolean>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$2
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(CredentialEntry credentialEntry) {
                    return Boolean.valueOf(credentialEntry != null);
                }
            };
            Stream filter = map.filter(new Predicate() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda29
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean convertToJetpackResponse$lambda$7;
                    convertToJetpackResponse$lambda$7 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$7(Function1.this, obj);
                    return convertToJetpackResponse$lambda$7;
                }
            });
            final BeginGetCredentialUtil$Companion$convertToJetpackResponse$3 beginGetCredentialUtil$Companion$convertToJetpackResponse$3 = new Function1<CredentialEntry, CredentialEntry>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$3
                @Override // kotlin.jvm.functions.Function1
                public final CredentialEntry invoke(CredentialEntry credentialEntry) {
                    Intrinsics.checkNotNull(credentialEntry);
                    return credentialEntry;
                }
            };
            Object collect = filter.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda30
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    CredentialEntry convertToJetpackResponse$lambda$8;
                    convertToJetpackResponse$lambda$8 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$8(Function1.this, obj);
                    return convertToJetpackResponse$lambda$8;
                }
            }).collect(Collectors.toList());
            Intrinsics.checkNotNullExpressionValue(collect, "response.credentialEntri…lect(Collectors.toList())");
            List list = (List) collect;
            actions = response.getActions();
            Stream stream2 = actions.stream();
            final BeginGetCredentialUtil$Companion$convertToJetpackResponse$4 beginGetCredentialUtil$Companion$convertToJetpackResponse$4 = new Function1<android.service.credentials.Action, Action>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Action invoke2(android.service.credentials.Action action) {
                    Slice slice2;
                    Action.Companion companion = Action.INSTANCE;
                    slice2 = action.getSlice();
                    Intrinsics.checkNotNullExpressionValue(slice2, "entry.slice");
                    return companion.fromSlice(slice2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Action invoke(android.service.credentials.Action action) {
                    return invoke2(Util$$ExternalSyntheticApiModelOutline0.m9351m((Object) action));
                }
            };
            Stream map2 = stream2.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda31
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Action convertToJetpackResponse$lambda$9;
                    convertToJetpackResponse$lambda$9 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$9(Function1.this, obj);
                    return convertToJetpackResponse$lambda$9;
                }
            });
            final BeginGetCredentialUtil$Companion$convertToJetpackResponse$5 beginGetCredentialUtil$Companion$convertToJetpackResponse$5 = new Function1<Action, Boolean>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$5
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Action action) {
                    return Boolean.valueOf(action != null);
                }
            };
            Stream filter2 = map2.filter(new Predicate() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda32
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean convertToJetpackResponse$lambda$10;
                    convertToJetpackResponse$lambda$10 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$10(Function1.this, obj);
                    return convertToJetpackResponse$lambda$10;
                }
            });
            final BeginGetCredentialUtil$Companion$convertToJetpackResponse$6 beginGetCredentialUtil$Companion$convertToJetpackResponse$6 = new Function1<Action, Action>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$6
                @Override // kotlin.jvm.functions.Function1
                public final Action invoke(Action action) {
                    Intrinsics.checkNotNull(action);
                    return action;
                }
            };
            Object collect2 = filter2.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda33
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Action convertToJetpackResponse$lambda$11;
                    convertToJetpackResponse$lambda$11 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$11(Function1.this, obj);
                    return convertToJetpackResponse$lambda$11;
                }
            }).collect(Collectors.toList());
            Intrinsics.checkNotNullExpressionValue(collect2, "response.actions\n       …lect(Collectors.toList())");
            List list2 = (List) collect2;
            authenticationActions = response.getAuthenticationActions();
            Stream stream3 = authenticationActions.stream();
            final BeginGetCredentialUtil$Companion$convertToJetpackResponse$7 beginGetCredentialUtil$Companion$convertToJetpackResponse$7 = new Function1<android.service.credentials.Action, AuthenticationAction>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final AuthenticationAction invoke2(android.service.credentials.Action action) {
                    Slice slice2;
                    AuthenticationAction.Companion companion = AuthenticationAction.INSTANCE;
                    slice2 = action.getSlice();
                    Intrinsics.checkNotNullExpressionValue(slice2, "entry.slice");
                    return companion.fromSlice(slice2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ AuthenticationAction invoke(android.service.credentials.Action action) {
                    return invoke2(Util$$ExternalSyntheticApiModelOutline0.m9351m((Object) action));
                }
            };
            Stream map3 = stream3.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda34
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    AuthenticationAction convertToJetpackResponse$lambda$12;
                    convertToJetpackResponse$lambda$12 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$12(Function1.this, obj);
                    return convertToJetpackResponse$lambda$12;
                }
            });
            final BeginGetCredentialUtil$Companion$convertToJetpackResponse$8 beginGetCredentialUtil$Companion$convertToJetpackResponse$8 = new Function1<AuthenticationAction, Boolean>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$8
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(AuthenticationAction authenticationAction) {
                    return Boolean.valueOf(authenticationAction != null);
                }
            };
            Stream filter3 = map3.filter(new Predicate() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda26
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean convertToJetpackResponse$lambda$13;
                    convertToJetpackResponse$lambda$13 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$13(Function1.this, obj);
                    return convertToJetpackResponse$lambda$13;
                }
            });
            final BeginGetCredentialUtil$Companion$convertToJetpackResponse$9 beginGetCredentialUtil$Companion$convertToJetpackResponse$9 = new Function1<AuthenticationAction, AuthenticationAction>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$9
                @Override // kotlin.jvm.functions.Function1
                public final AuthenticationAction invoke(AuthenticationAction authenticationAction) {
                    Intrinsics.checkNotNull(authenticationAction);
                    return authenticationAction;
                }
            };
            Object collect3 = filter3.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda27
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    AuthenticationAction convertToJetpackResponse$lambda$14;
                    convertToJetpackResponse$lambda$14 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$14(Function1.this, obj);
                    return convertToJetpackResponse$lambda$14;
                }
            }).collect(Collectors.toList());
            Intrinsics.checkNotNullExpressionValue(collect3, "response.authenticationA…lect(Collectors.toList())");
            List list3 = (List) collect3;
            remoteCredentialEntry = response.getRemoteCredentialEntry();
            if (remoteCredentialEntry != null) {
                RemoteEntry.Companion companion = RemoteEntry.INSTANCE;
                slice = remoteCredentialEntry.getSlice();
                Intrinsics.checkNotNullExpressionValue(slice, "it.slice");
                remoteEntry = companion.fromSlice(slice);
            } else {
                remoteEntry = null;
            }
            return new androidx.credentials.provider.BeginGetCredentialResponse(list, list2, list3, remoteEntry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CredentialEntry convertToJetpackResponse$lambda$6(Function1 function1, Object obj) {
            return (CredentialEntry) function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$7(Function1 function1, Object obj) {
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CredentialEntry convertToJetpackResponse$lambda$8(Function1 function1, Object obj) {
            return (CredentialEntry) function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Action convertToJetpackResponse$lambda$9(Function1 function1, Object obj) {
            return (Action) function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$10(Function1 function1, Object obj) {
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Action convertToJetpackResponse$lambda$11(Function1 function1, Object obj) {
            return (Action) function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AuthenticationAction convertToJetpackResponse$lambda$12(Function1 function1, Object obj) {
            return (AuthenticationAction) function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$13(Function1 function1, Object obj) {
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AuthenticationAction convertToJetpackResponse$lambda$14(Function1 function1, Object obj) {
            return (AuthenticationAction) function1.invoke(obj);
        }
    }
}
