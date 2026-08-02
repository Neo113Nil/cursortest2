package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.internal.AppEventUtility;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEventDiskStore.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/AppEventDiskStore;", "", "()V", "PERSISTED_EVENTS_FILENAME", "", "TAG", "kotlin.jvm.PlatformType", "readAndClearStore", "Lcom/facebook/appevents/PersistedEvents;", "saveEventsToDisk", "", "eventsToPersist", "saveEventsToDisk$facebook_core_release", "MovedClassObjectInputStream", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppEventDiskStore {
    private static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
    public static final AppEventDiskStore INSTANCE = new AppEventDiskStore();
    private static final String TAG = AppEventDiskStore.class.getName();

    private AppEventDiskStore() {
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0060: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:66:0x0060 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ca A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:14:0x0039, B:16:0x00ca, B:22:0x0045, B:23:0x0049, B:62:0x0071, B:65:0x007c, B:54:0x008e, B:57:0x0099, B:38:0x009e, B:39:0x00b2, B:42:0x00a9, B:45:0x00b3, B:49:0x00be, B:7:0x000b, B:12:0x0036, B:60:0x0068, B:52:0x0085, B:30:0x0058, B:31:0x005b), top: B:3:0x0003, inners: #1, #3, #8, #9, #12, #14 }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized PersistedEvents readAndClearStore() {
        PersistedEvents persistedEvents;
        String str;
        String str2;
        PersistedEvents persistedEvents2;
        Throwable th;
        synchronized (AppEventDiskStore.class) {
            AppEventUtility.assertIsNotMainThread();
            Context applicationContext = FacebookSdk.getApplicationContext();
            PersistedEvents persistedEvents3 = null;
            try {
                try {
                    try {
                        FileInputStream openFileInput = applicationContext.openFileInput(PERSISTED_EVENTS_FILENAME);
                        Intrinsics.checkNotNullExpressionValue(openFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                        MovedClassObjectInputStream movedClassObjectInputStream = new MovedClassObjectInputStream(new BufferedInputStream(openFileInput));
                        try {
                            Object readObject = movedClassObjectInputStream.readObject();
                            Intrinsics.checkNotNull(readObject, "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                            persistedEvents2 = (PersistedEvents) readObject;
                            try {
                                Unit unit = Unit.INSTANCE;
                                CloseableKt.closeFinally(movedClassObjectInputStream, null);
                                try {
                                    applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                                } catch (Exception e) {
                                    e = e;
                                    str = TAG;
                                    str2 = "Got unexpected exception when removing events file: ";
                                    Log.w(str, str2, e);
                                    if (persistedEvents2 == null) {
                                    }
                                    return persistedEvents2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    CloseableKt.closeFinally(movedClassObjectInputStream, th);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } finally {
                        try {
                            applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e2) {
                            Log.w(TAG, "Got unexpected exception when removing events file: ", e2);
                        }
                    }
                } catch (FileNotFoundException unused) {
                    persistedEvents2 = persistedEvents3;
                    if (persistedEvents2 == null) {
                    }
                    return persistedEvents2;
                } catch (IOException e3) {
                    persistedEvents2 = null;
                    e = e3;
                    Log.w(TAG, "Got unexpected exception while reading events: ", e);
                    try {
                        applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                    } catch (Exception e4) {
                        e = e4;
                        str = TAG;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                        if (persistedEvents2 == null) {
                        }
                        return persistedEvents2;
                    }
                    if (persistedEvents2 == null) {
                    }
                    return persistedEvents2;
                } catch (ClassNotFoundException e5) {
                    persistedEvents2 = null;
                    e = e5;
                    Log.w(TAG, "Got unexpected exception while reading events: ", e);
                    try {
                        applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                    } catch (Exception e6) {
                        e = e6;
                        str = TAG;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                        if (persistedEvents2 == null) {
                        }
                        return persistedEvents2;
                    }
                    if (persistedEvents2 == null) {
                    }
                    return persistedEvents2;
                }
            } catch (FileNotFoundException unused2) {
                persistedEvents3 = persistedEvents;
                persistedEvents2 = persistedEvents3;
                if (persistedEvents2 == null) {
                }
                return persistedEvents2;
            } catch (IOException e7) {
                e = e7;
                Log.w(TAG, "Got unexpected exception while reading events: ", e);
                applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                if (persistedEvents2 == null) {
                }
                return persistedEvents2;
            } catch (ClassNotFoundException e8) {
                e = e8;
                Log.w(TAG, "Got unexpected exception while reading events: ", e);
                applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                if (persistedEvents2 == null) {
                }
                return persistedEvents2;
            }
            if (persistedEvents2 == null) {
                persistedEvents2 = new PersistedEvents();
            }
        }
        return persistedEvents2;
    }

    @JvmStatic
    public static final void saveEventsToDisk$facebook_core_release(PersistedEvents eventsToPersist) {
        Context applicationContext = FacebookSdk.getApplicationContext();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(applicationContext.openFileOutput(PERSISTED_EVENTS_FILENAME, 0)));
            try {
                objectOutputStream.writeObject(eventsToPersist);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(objectOutputStream, null);
            } finally {
            }
        } catch (IOException e) {
            Log.w(TAG, "Got unexpected exception while persisting events: ", e);
            try {
                applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: AppEventDiskStore.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/AppEventDiskStore$MovedClassObjectInputStream;", "Ljava/io/ObjectInputStream;", "inputStream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)V", "readClassDescriptor", "Ljava/io/ObjectStreamClass;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class MovedClassObjectInputStream extends ObjectInputStream {
        private static final String ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";
        private static final String APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2";

        public MovedClassObjectInputStream(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (Intrinsics.areEqual(resultClassDescriptor.getName(), ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                resultClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (Intrinsics.areEqual(resultClassDescriptor.getName(), APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                resultClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }
}
