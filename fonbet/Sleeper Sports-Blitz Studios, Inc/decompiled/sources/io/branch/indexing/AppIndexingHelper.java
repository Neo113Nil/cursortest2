package io.branch.indexing;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.appindexing.Action;
import com.google.firebase.appindexing.FirebaseAppIndex;
import com.google.firebase.appindexing.FirebaseUserActions;
import com.google.firebase.appindexing.Indexable;
import com.google.firebase.appindexing.builders.Indexables;
import io.branch.referral.PrefHelper;
import io.branch.referral.util.LinkProperties;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
class AppIndexingHelper {
    private static final LinkProperties DEF_LINK_PROPERTIES = new LinkProperties().setChannel("google_search");
    private static FirebaseUserActions firebaseUserActionsInstance;

    AppIndexingHelper() {
    }

    static void addToAppIndex(final Context context, final BranchUniversalObject branchUniversalObject, final LinkProperties linkProperties) {
        new Thread(new Runnable() { // from class: io.branch.indexing.AppIndexingHelper.1
            @Override // java.lang.Runnable
            public void run() {
                String shortUrl;
                try {
                    FirebaseUserActions unused = AppIndexingHelper.firebaseUserActionsInstance = FirebaseUserActions.getInstance();
                } catch (NoClassDefFoundError unused2) {
                    PrefHelper.Debug("Firebase app indexing is not available. Please consider enabling Firebase app indexing for your app for better indexing experience with Google.");
                } catch (Throwable unused3) {
                    PrefHelper.Debug("Failed to index your contents using Firebase. Please make sure Firebase  is enabled and initialised in your app");
                }
                LinkProperties linkProperties2 = LinkProperties.this;
                if (linkProperties2 == null) {
                    shortUrl = branchUniversalObject.getShortUrl(context, AppIndexingHelper.DEF_LINK_PROPERTIES);
                } else {
                    shortUrl = branchUniversalObject.getShortUrl(context, linkProperties2);
                }
                PrefHelper.Debug("Indexing BranchUniversalObject with Google using URL " + shortUrl);
                if (TextUtils.isEmpty(shortUrl)) {
                    return;
                }
                try {
                    if (AppIndexingHelper.firebaseUserActionsInstance != null) {
                        AppIndexingHelper.addToAppIndexUsingFirebase(shortUrl, branchUniversalObject);
                    } else {
                        AppIndexingHelper.listOnGoogleSearch(shortUrl, context, branchUniversalObject);
                    }
                } catch (Throwable unused4) {
                    PrefHelper.Debug("Warning: Unable to list your content in Google search. Please make sure you have added latest Firebase app indexing SDK to your project dependencies.");
                }
            }
        }).start();
    }

    static void removeFromFirebaseLocalIndex(final Context context, final BranchUniversalObject branchUniversalObject, final LinkProperties linkProperties) {
        new Thread(new Runnable() { // from class: io.branch.indexing.AppIndexingHelper.2
            @Override // java.lang.Runnable
            public void run() {
                String shortUrl;
                try {
                    LinkProperties linkProperties2 = LinkProperties.this;
                    if (linkProperties2 == null) {
                        shortUrl = branchUniversalObject.getShortUrl(context, AppIndexingHelper.DEF_LINK_PROPERTIES);
                    } else {
                        shortUrl = branchUniversalObject.getShortUrl(context, linkProperties2);
                    }
                    PrefHelper.Debug("Removing indexed BranchUniversalObject with link " + shortUrl);
                    FirebaseAppIndex.getInstance().remove(new String[]{shortUrl});
                } catch (NoClassDefFoundError unused) {
                    PrefHelper.Debug("Failed to remove the BranchUniversalObject from Firebase local indexing. Please make sure Firebase is enabled and initialised in your app");
                } catch (Throwable unused2) {
                    PrefHelper.Debug("Failed to index your contents using Firebase. Please make sure Firebase is enabled and initialised in your app");
                }
            }
        }).run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addToAppIndexUsingFirebase(String str, BranchUniversalObject branchUniversalObject) {
        String str2 = branchUniversalObject.getTitle() + "\n" + branchUniversalObject.getDescription();
        if (branchUniversalObject.isLocallyIndexable()) {
            FirebaseAppIndex.getInstance().update(new Indexable[]{Indexables.newSimple(str2, str)});
        }
        firebaseUserActionsInstance.end(new Action.Builder("ViewAction").setObject(str2, str).setMetadata(new Action.Metadata.Builder().setUpload(branchUniversalObject.isPublicallyIndexable())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void listOnGoogleSearch(String str, Context context, BranchUniversalObject branchUniversalObject) throws Exception {
        Class<?> cls = Class.forName("com.google.android.gms.appindexing.Thing");
        Class<?> cls2 = Class.forName("com.google.android.gms.appindexing.Thing$Builder");
        Object newInstance = cls2.getConstructor(null).newInstance(null);
        Method method = cls2.getMethod("setName", String.class);
        Method method2 = cls2.getMethod("setDescription", String.class);
        Method method3 = cls2.getMethod("setUrl", Uri.class);
        Method method4 = cls2.getMethod("build", null);
        method.invoke(newInstance, branchUniversalObject.getTitle());
        method2.invoke(newInstance, branchUniversalObject.getDescription());
        method3.invoke(newInstance, Uri.parse(str));
        Object invoke = method4.invoke(newInstance, null);
        Class<?> cls3 = Class.forName("com.google.android.gms.appindexing.Action");
        Class<?> cls4 = Class.forName("com.google.android.gms.appindexing.Action$Builder");
        Object newInstance2 = cls4.getConstructor(String.class).newInstance((String) cls3.getDeclaredField("TYPE_VIEW").get(null));
        Method method5 = cls4.getMethod("setObject", cls);
        Method method6 = cls4.getMethod("setActionStatus", String.class);
        Method method7 = cls4.getMethod("build", null);
        method5.invoke(newInstance2, invoke);
        method6.invoke(newInstance2, (String) cls3.getDeclaredField("STATUS_TYPE_COMPLETED").get(null));
        Object invoke2 = method7.invoke(newInstance2, null);
        Class<?> cls5 = Class.forName("com.google.android.gms.appindexing.AppIndex");
        Class<?> cls6 = Class.forName("com.google.android.gms.common.api.Api");
        Class<?> cls7 = Class.forName("com.google.android.gms.common.api.GoogleApiClient");
        Class<?> cls8 = Class.forName("com.google.android.gms.common.api.GoogleApiClient$Builder");
        Object newInstance3 = cls8.getConstructor(Context.class).newInstance(context);
        Method method8 = cls8.getMethod("addApi", cls6);
        Method method9 = cls8.getMethod("build", null);
        Method method10 = cls7.getMethod("connect", null);
        Method method11 = cls7.getMethod("disconnect", null);
        method8.invoke(newInstance3, cls6.cast(cls5.getDeclaredField("API").get(null)));
        Object invoke3 = method9.invoke(newInstance3, null);
        method10.invoke(invoke3, null);
        Class<?> cls9 = Class.forName("com.google.android.gms.appindexing.AppIndexApi");
        cls9.getMethod("start", cls7, cls3).invoke(cls5.getDeclaredField("AppIndexApi").get(null), invoke3, invoke2);
        method11.invoke(invoke3, null);
    }
}
