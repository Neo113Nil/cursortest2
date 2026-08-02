package androidx.credentials.provider.utils;

import android.annotation.SuppressLint;
import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.CallingAppInfo;
import androidx.credentials.provider.Action;
import androidx.credentials.provider.AuthenticationAction;
import androidx.credentials.provider.BeginGetCredentialOption;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.CredentialEntry;
import androidx.credentials.provider.RemoteEntry;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import xsna.a91;
import xsna.ax6;
import xsna.bx6;
import xsna.cb1;
import xsna.cx6;
import xsna.dx6;
import xsna.eb1;
import xsna.fx6;
import xsna.gb1;
import xsna.izs;
import xsna.o81;
import xsna.o92;
import xsna.p81;
import xsna.q91;
import xsna.r81;
import xsna.s81;
import xsna.t81;
import xsna.t91;
import xsna.u81;
import xsna.v81;
import xsna.w81;
import xsna.ww6;
import xsna.x81;
import xsna.zcl;

/* compiled from: BeginGetCredentialUtil.kt */
/* loaded from: classes12.dex */
public final class BeginGetCredentialUtil {
    public static final Companion Companion = new Companion(null);

    /* compiled from: BeginGetCredentialUtil.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BeginGetCredentialOption convertToFrameworkRequest$lambda$5(izs izsVar, Object obj) {
            return a91.g(izsVar.invoke(obj));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BeginGetCredentialOption convertToJetpackBeginOption(androidx.credentials.provider.BeginGetCredentialOption beginGetCredentialOption) {
            p81.j();
            return o81.e(beginGetCredentialOption.getId(), beginGetCredentialOption.getType(), beginGetCredentialOption.getCandidateQueryData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$10(izs izsVar, Object obj) {
            return ((Boolean) izsVar.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Action convertToJetpackResponse$lambda$11(izs izsVar, Object obj) {
            return (Action) izsVar.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AuthenticationAction convertToJetpackResponse$lambda$12(izs izsVar, Object obj) {
            return (AuthenticationAction) izsVar.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$13(izs izsVar, Object obj) {
            return ((Boolean) izsVar.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AuthenticationAction convertToJetpackResponse$lambda$14(izs izsVar, Object obj) {
            return (AuthenticationAction) izsVar.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CredentialEntry convertToJetpackResponse$lambda$6(izs izsVar, Object obj) {
            return (CredentialEntry) izsVar.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$7(izs izsVar, Object obj) {
            return ((Boolean) izsVar.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CredentialEntry convertToJetpackResponse$lambda$8(izs izsVar, Object obj) {
            return (CredentialEntry) izsVar.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Action convertToJetpackResponse$lambda$9(izs izsVar, Object obj) {
            return (Action) izsVar.invoke(obj);
        }

        private final void populateActionEntries(BeginGetCredentialResponse.Builder builder, List<Action> list) {
            for (Action action : list) {
                s81.j();
                builder.addAction(r81.f(Action.Companion.toSlice(action)));
            }
        }

        private final void populateAuthenticationEntries(BeginGetCredentialResponse.Builder builder, List<AuthenticationAction> list) {
            for (AuthenticationAction authenticationAction : list) {
                s81.j();
                builder.addAuthenticationAction(r81.f(AuthenticationAction.Companion.toSlice(authenticationAction)));
            }
        }

        private final void populateCredentialEntries(BeginGetCredentialResponse.Builder builder, List<? extends CredentialEntry> list) {
            for (CredentialEntry credentialEntry : list) {
                Slice slice$credentials_release = CredentialEntry.Companion.toSlice$credentials_release(credentialEntry);
                if (slice$credentials_release != null) {
                    v81.i();
                    p81.j();
                    String id = credentialEntry.getBeginGetCredentialOption().getId();
                    String type = credentialEntry.getType();
                    Bundle bundle = Bundle.EMPTY;
                    builder.addCredentialEntry(u81.h(t81.e(id, type), slice$credentials_release));
                }
            }
        }

        @SuppressLint({"MissingPermission"})
        private final void populateRemoteEntry(BeginGetCredentialResponse.Builder builder, RemoteEntry remoteEntry) {
            if (remoteEntry == null) {
                return;
            }
            cb1.g();
            builder.setRemoteCredentialEntry(o92.e(RemoteEntry.Companion.toSlice(remoteEntry)));
        }

        public final BeginGetCredentialRequest convertToFrameworkRequest(androidx.credentials.provider.BeginGetCredentialRequest beginGetCredentialRequest) {
            BeginGetCredentialRequest.Builder beginGetCredentialOptions;
            BeginGetCredentialRequest build;
            BeginGetCredentialRequest.Builder j = x81.j();
            if (beginGetCredentialRequest.getCallingAppInfo() != null) {
                gb1.f();
                j.setCallingAppInfo(eb1.e(beginGetCredentialRequest.getCallingAppInfo().getPackageName(), beginGetCredentialRequest.getCallingAppInfo().getSigningInfo(), beginGetCredentialRequest.getCallingAppInfo().getOrigin$credentials_release()));
            }
            beginGetCredentialOptions = j.setBeginGetCredentialOptions((List) beginGetCredentialRequest.getBeginGetCredentialOptions().stream().map(new fx6(new izs<androidx.credentials.provider.BeginGetCredentialOption, BeginGetCredentialOption>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToFrameworkRequest$1
                @Override // xsna.izs
                public final BeginGetCredentialOption invoke(androidx.credentials.provider.BeginGetCredentialOption beginGetCredentialOption) {
                    BeginGetCredentialOption convertToJetpackBeginOption;
                    convertToJetpackBeginOption = BeginGetCredentialUtil.Companion.convertToJetpackBeginOption(beginGetCredentialOption);
                    return convertToJetpackBeginOption;
                }
            }, 0)).collect(Collectors.toList()));
            build = beginGetCredentialOptions.build();
            return build;
        }

        public final BeginGetCredentialResponse convertToFrameworkResponse(androidx.credentials.provider.BeginGetCredentialResponse beginGetCredentialResponse) {
            BeginGetCredentialResponse build;
            BeginGetCredentialResponse.Builder f = w81.f();
            populateCredentialEntries(f, beginGetCredentialResponse.getCredentialEntries());
            populateActionEntries(f, beginGetCredentialResponse.getActions());
            populateAuthenticationEntries(f, beginGetCredentialResponse.getAuthenticationActions());
            populateRemoteEntry(f, beginGetCredentialResponse.getRemoteEntry());
            build = f.build();
            return build;
        }

        public final androidx.credentials.provider.BeginGetCredentialRequest convertToJetpackRequest$credentials_release(BeginGetCredentialRequest beginGetCredentialRequest) {
            List beginGetCredentialOptions;
            CallingAppInfo callingAppInfo;
            androidx.credentials.provider.CallingAppInfo callingAppInfo2;
            String packageName;
            SigningInfo signingInfo;
            String origin;
            String id;
            String type;
            Bundle candidateQueryData;
            ArrayList arrayList = new ArrayList();
            beginGetCredentialOptions = beginGetCredentialRequest.getBeginGetCredentialOptions();
            Iterator it = beginGetCredentialOptions.iterator();
            while (it.hasNext()) {
                BeginGetCredentialOption g = a91.g(it.next());
                BeginGetCredentialOption.Companion companion = androidx.credentials.provider.BeginGetCredentialOption.Companion;
                id = g.getId();
                type = g.getType();
                candidateQueryData = g.getCandidateQueryData();
                arrayList.add(companion.createFrom$credentials_release(id, type, candidateQueryData));
            }
            callingAppInfo = beginGetCredentialRequest.getCallingAppInfo();
            if (callingAppInfo != null) {
                CallingAppInfo.Companion companion2 = androidx.credentials.provider.CallingAppInfo.Companion;
                packageName = callingAppInfo.getPackageName();
                signingInfo = callingAppInfo.getSigningInfo();
                origin = callingAppInfo.getOrigin();
                callingAppInfo2 = companion2.create(packageName, signingInfo, origin);
            } else {
                callingAppInfo2 = null;
            }
            return new androidx.credentials.provider.BeginGetCredentialRequest(arrayList, callingAppInfo2);
        }

        public final androidx.credentials.provider.BeginGetCredentialResponse convertToJetpackResponse(BeginGetCredentialResponse beginGetCredentialResponse) {
            List credentialEntries;
            List actions;
            List authenticationActions;
            android.service.credentials.RemoteEntry remoteCredentialEntry;
            RemoteEntry remoteEntry;
            Slice slice;
            credentialEntries = beginGetCredentialResponse.getCredentialEntries();
            Stream stream = credentialEntries.stream();
            final BeginGetCredentialUtil$Companion$convertToJetpackResponse$1 beginGetCredentialUtil$Companion$convertToJetpackResponse$1 = new izs<android.service.credentials.CredentialEntry, CredentialEntry>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final CredentialEntry invoke2(android.service.credentials.CredentialEntry credentialEntry) {
                    Slice slice2;
                    CredentialEntry.Companion companion = CredentialEntry.Companion;
                    slice2 = credentialEntry.getSlice();
                    return companion.fromSlice$credentials_release(slice2);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ CredentialEntry invoke(android.service.credentials.CredentialEntry credentialEntry) {
                    return invoke2(q91.g(credentialEntry));
                }
            };
            Stream map = stream.map(new Function() { // from class: xsna.yw6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    CredentialEntry convertToJetpackResponse$lambda$6;
                    convertToJetpackResponse$lambda$6 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$6(izs.this, obj);
                    return convertToJetpackResponse$lambda$6;
                }
            });
            final BeginGetCredentialUtil$Companion$convertToJetpackResponse$2 beginGetCredentialUtil$Companion$convertToJetpackResponse$2 = new izs<CredentialEntry, Boolean>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$2
                @Override // xsna.izs
                public final Boolean invoke(CredentialEntry credentialEntry) {
                    return Boolean.valueOf(credentialEntry != null);
                }
            };
            List list = (List) map.filter(new Predicate() { // from class: xsna.zw6
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean convertToJetpackResponse$lambda$7;
                    convertToJetpackResponse$lambda$7 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$7(izs.this, obj);
                    return convertToJetpackResponse$lambda$7;
                }
            }).map(new ax6(new izs<CredentialEntry, CredentialEntry>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$3
                @Override // xsna.izs
                public final CredentialEntry invoke(CredentialEntry credentialEntry) {
                    return credentialEntry;
                }
            }, 0)).collect(Collectors.toList());
            actions = beginGetCredentialResponse.getActions();
            int i = 0;
            List list2 = (List) actions.stream().map(new bx6(new izs<android.service.credentials.Action, Action>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Action invoke2(android.service.credentials.Action action) {
                    Slice slice2;
                    Action.Companion companion = Action.Companion;
                    slice2 = action.getSlice();
                    return companion.fromSlice(slice2);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ Action invoke(android.service.credentials.Action action) {
                    return invoke2(t91.e(action));
                }
            }, i)).filter(new cx6(new izs<Action, Boolean>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$5
                @Override // xsna.izs
                public final Boolean invoke(Action action) {
                    return Boolean.valueOf(action != null);
                }
            }, i)).map(new dx6(new izs<Action, Action>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$6
                @Override // xsna.izs
                public final Action invoke(Action action) {
                    return action;
                }
            }, i)).collect(Collectors.toList());
            authenticationActions = beginGetCredentialResponse.getAuthenticationActions();
            Stream stream2 = authenticationActions.stream();
            final BeginGetCredentialUtil$Companion$convertToJetpackResponse$7 beginGetCredentialUtil$Companion$convertToJetpackResponse$7 = new izs<android.service.credentials.Action, AuthenticationAction>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final AuthenticationAction invoke2(android.service.credentials.Action action) {
                    Slice slice2;
                    AuthenticationAction.Companion companion = AuthenticationAction.Companion;
                    slice2 = action.getSlice();
                    return companion.fromSlice(slice2);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ AuthenticationAction invoke(android.service.credentials.Action action) {
                    return invoke2(t91.e(action));
                }
            };
            Stream filter = stream2.map(new Function() { // from class: xsna.ex6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    AuthenticationAction convertToJetpackResponse$lambda$12;
                    convertToJetpackResponse$lambda$12 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$12(izs.this, obj);
                    return convertToJetpackResponse$lambda$12;
                }
            }).filter(new ww6(new izs<AuthenticationAction, Boolean>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$8
                @Override // xsna.izs
                public final Boolean invoke(AuthenticationAction authenticationAction) {
                    return Boolean.valueOf(authenticationAction != null);
                }
            }, 0));
            final BeginGetCredentialUtil$Companion$convertToJetpackResponse$9 beginGetCredentialUtil$Companion$convertToJetpackResponse$9 = new izs<AuthenticationAction, AuthenticationAction>() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$convertToJetpackResponse$9
                @Override // xsna.izs
                public final AuthenticationAction invoke(AuthenticationAction authenticationAction) {
                    return authenticationAction;
                }
            };
            List list3 = (List) filter.map(new Function() { // from class: xsna.xw6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    AuthenticationAction convertToJetpackResponse$lambda$14;
                    convertToJetpackResponse$lambda$14 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$14(izs.this, obj);
                    return convertToJetpackResponse$lambda$14;
                }
            }).collect(Collectors.toList());
            remoteCredentialEntry = beginGetCredentialResponse.getRemoteCredentialEntry();
            if (remoteCredentialEntry != null) {
                RemoteEntry.Companion companion = RemoteEntry.Companion;
                slice = remoteCredentialEntry.getSlice();
                remoteEntry = companion.fromSlice(slice);
            } else {
                remoteEntry = null;
            }
            return new androidx.credentials.provider.BeginGetCredentialResponse(list, list2, list3, remoteEntry);
        }

        private Companion() {
        }
    }
}
