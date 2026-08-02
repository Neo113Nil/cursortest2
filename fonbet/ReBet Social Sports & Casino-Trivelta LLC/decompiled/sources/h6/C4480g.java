package h6;

import T7.Y;
import android.content.Context;
import android.util.Log;
import g6.C4331C;
import h6.C4474a;
import h6.C4478e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4480g {

    /* renamed from: a, reason: collision with root package name */
    public static final C4480g f47777a = new C4480g();

    /* renamed from: b, reason: collision with root package name */
    public static final String f47778b = C4480g.class.getName();

    /* renamed from: h6.g$a */
    public static final class a extends ObjectInputStream {

        /* renamed from: a, reason: collision with root package name */
        public static final C0716a f47779a = new C0716a(null);

        /* renamed from: h6.g$a$a, reason: collision with other inner class name */
        public static final class C0716a {
            public /* synthetic */ C0716a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0716a() {
            }
        }

        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                resultClassDescriptor = ObjectStreamClass.lookup(C4474a.b.class);
            } else if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                resultClassDescriptor = ObjectStreamClass.lookup(C4478e.b.class);
            }
            Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:12:0x0028, B:14:0x002b, B:17:0x009d, B:23:0x0039, B:45:0x0071, B:47:0x0074, B:48:0x0086, B:51:0x007f, B:37:0x005e, B:39:0x0061, B:42:0x006c, B:34:0x0098, B:27:0x0087, B:29:0x008a, B:32:0x0095), top: B:3:0x0003, inners: #0, #2, #5, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized C4471G a() {
        C4471G c4471g;
        Throwable th2;
        a aVar;
        String str;
        Object readObject;
        synchronized (C4480g.class) {
            p6.g.b();
            Context l10 = C4331C.l();
            c4471g = null;
            try {
                try {
                    FileInputStream openFileInput = l10.openFileInput("AppEventsLogger.persistedevents");
                    Intrinsics.checkNotNullExpressionValue(openFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                    aVar = new a(new BufferedInputStream(openFileInput));
                    try {
                        readObject = aVar.readObject();
                    } catch (FileNotFoundException unused) {
                        Y.j(aVar);
                        try {
                            l10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e10) {
                            e = e10;
                            str = f47778b;
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                            if (c4471g == null) {
                            }
                            return c4471g;
                        }
                        if (c4471g == null) {
                        }
                        return c4471g;
                    } catch (Exception e11) {
                        e = e11;
                        Log.w(f47778b, "Got unexpected exception while reading events: ", e);
                        Y.j(aVar);
                        try {
                            l10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e12) {
                            e = e12;
                            str = f47778b;
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                            if (c4471g == null) {
                            }
                            return c4471g;
                        }
                        if (c4471g == null) {
                        }
                        return c4471g;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    Y.j(null);
                    try {
                        l10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e13) {
                        Log.w(f47778b, "Got unexpected exception when removing events file: ", e13);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException unused2) {
                aVar = null;
            } catch (Exception e14) {
                e = e14;
                aVar = null;
            } catch (Throwable th4) {
                th2 = th4;
                Y.j(null);
                l10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                throw th2;
            }
            if (readObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
            }
            C4471G c4471g2 = (C4471G) readObject;
            Y.j(aVar);
            try {
                l10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            } catch (Exception e15) {
                Log.w(f47778b, "Got unexpected exception when removing events file: ", e15);
            }
            c4471g = c4471g2;
            if (c4471g == null) {
                c4471g = new C4471G();
            }
        }
        return c4471g;
    }

    public static final void b(C4471G c4471g) {
        ObjectOutputStream objectOutputStream;
        Context l10 = C4331C.l();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(l10.openFileOutput("AppEventsLogger.persistedevents", 0)));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            objectOutputStream.writeObject(c4471g);
            Y.j(objectOutputStream);
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream2 = objectOutputStream;
            try {
                Log.w(f47778b, "Got unexpected exception while persisting events: ", th);
                try {
                    l10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused) {
                }
            } finally {
                Y.j(objectOutputStream2);
            }
        }
    }
}
