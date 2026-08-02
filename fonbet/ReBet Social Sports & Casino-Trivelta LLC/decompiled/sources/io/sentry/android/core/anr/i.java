package io.sentry.android.core.anr;

import io.sentry.util.D;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;

/* loaded from: classes3.dex */
public final class i implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f50915a;
    public final StackTraceElement[] stack;

    public i(long j10, StackTraceElement[] stackTraceElementArr) {
        this.f50915a = j10;
        this.stack = stackTraceElementArr;
    }

    public static i b(DataInputStream dataInputStream) {
        try {
            if (dataInputStream.readShort() == 1) {
                long readLong = dataInputStream.readLong();
                int readInt = dataInputStream.readInt();
                if (readInt >= 0 && readInt <= 1000) {
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[readInt];
                    for (int i10 = 0; i10 < readInt; i10++) {
                        String readUTF = dataInputStream.readUTF();
                        String readUTF2 = dataInputStream.readUTF();
                        boolean readBoolean = dataInputStream.readBoolean();
                        String readUTF3 = dataInputStream.readUTF();
                        if (readBoolean) {
                            readUTF3 = null;
                        }
                        stackTraceElementArr[i10] = new StackTraceElement(readUTF, readUTF2, readUTF3, dataInputStream.readInt());
                    }
                    return new i(readLong, stackTraceElementArr);
                }
            }
        } catch (EOFException unused) {
        }
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return Long.compare(this.f50915a, iVar.f50915a);
    }

    public void c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(1);
        dataOutputStream.writeLong(this.f50915a);
        dataOutputStream.writeInt(this.stack.length);
        for (StackTraceElement stackTraceElement : this.stack) {
            dataOutputStream.writeUTF(D.e(stackTraceElement.getClassName()));
            dataOutputStream.writeUTF(D.e(stackTraceElement.getMethodName()));
            String fileName = stackTraceElement.getFileName();
            dataOutputStream.writeBoolean(fileName == null);
            if (fileName == null) {
                fileName = "";
            }
            dataOutputStream.writeUTF(fileName);
            dataOutputStream.writeInt(stackTraceElement.getLineNumber());
        }
    }
}
