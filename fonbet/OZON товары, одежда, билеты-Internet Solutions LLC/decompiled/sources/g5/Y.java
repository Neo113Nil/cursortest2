package g5;

import android.net.Uri;
import android.os.Build;
import androidx.work.d;
import androidx.work.v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Y {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63845a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f63846b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f63847c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f63848d;

        static {
            int[] iArr = new int[v.a.values().length];
            try {
                iArr[v.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[v.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[v.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f63845a = iArr;
            int[] iArr2 = new int[androidx.work.a.values().length];
            try {
                iArr2[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[androidx.work.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f63846b = iArr2;
            int[] iArr3 = new int[androidx.work.p.values().length];
            try {
                iArr3[androidx.work.p.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[androidx.work.p.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[androidx.work.p.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[androidx.work.p.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[androidx.work.p.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f63847c = iArr3;
            int[] iArr4 = new int[androidx.work.s.values().length];
            try {
                iArr4[androidx.work.s.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[androidx.work.s.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f63848d = iArr4;
        }
    }

    @NotNull
    public static final LinkedHashSet a(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int readInt = objectInputStream.readInt();
                        for (int i11 = 0; i11 < readInt; i11++) {
                            Uri uri = Uri.parse(objectInputStream.readUTF());
                            boolean readBoolean = objectInputStream.readBoolean();
                            Intrinsics.checkNotNullExpressionValue(uri, "uri");
                            linkedHashSet.add(new d.b(uri, readBoolean));
                        }
                        Unit unit = Unit.f71690a;
                        objectInputStream.close();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            Unit unit2 = Unit.f71690a;
            byteArrayInputStream.close();
        }
        return linkedHashSet;
    }

    @NotNull
    public static final androidx.work.a b(int i11) {
        if (i11 == 0) {
            return androidx.work.a.EXPONENTIAL;
        }
        if (i11 == 1) {
            return androidx.work.a.LINEAR;
        }
        throw new IllegalArgumentException(T7.E.a(i11, "Could not convert ", " to BackoffPolicy"));
    }

    @NotNull
    public static final androidx.work.p c(int i11) {
        if (i11 == 0) {
            return androidx.work.p.NOT_REQUIRED;
        }
        if (i11 == 1) {
            return androidx.work.p.CONNECTED;
        }
        if (i11 == 2) {
            return androidx.work.p.UNMETERED;
        }
        if (i11 == 3) {
            return androidx.work.p.NOT_ROAMING;
        }
        if (i11 == 4) {
            return androidx.work.p.METERED;
        }
        if (Build.VERSION.SDK_INT < 30 || i11 != 5) {
            throw new IllegalArgumentException(T7.E.a(i11, "Could not convert ", " to NetworkType"));
        }
        return androidx.work.p.TEMPORARILY_UNMETERED;
    }

    @NotNull
    public static final androidx.work.s d(int i11) {
        if (i11 == 0) {
            return androidx.work.s.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i11 == 1) {
            return androidx.work.s.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(T7.E.a(i11, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    @NotNull
    public static final v.a e(int i11) {
        if (i11 == 0) {
            return v.a.ENQUEUED;
        }
        if (i11 == 1) {
            return v.a.RUNNING;
        }
        if (i11 == 2) {
            return v.a.SUCCEEDED;
        }
        if (i11 == 3) {
            return v.a.FAILED;
        }
        if (i11 == 4) {
            return v.a.BLOCKED;
        }
        if (i11 == 5) {
            return v.a.CANCELLED;
        }
        throw new IllegalArgumentException(T7.E.a(i11, "Could not convert ", " to State"));
    }

    public static final int f(@NotNull androidx.work.p networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i11 = a.f63847c[networkType.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        if (i11 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == androidx.work.p.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @NotNull
    public static final byte[] g(@NotNull Set<d.b> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (d.b bVar : triggers) {
                    objectOutputStream.writeUTF(bVar.a().toString());
                    objectOutputStream.writeBoolean(bVar.b());
                }
                Unit unit = Unit.f71690a;
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int h(@NotNull v.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (a.f63845a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new Sc.o();
        }
    }
}
