package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.obfuscated.j2;
import java.util.ArrayList;
import java.util.Objects;
import xsna.ji;
import xsna.tgw;

/* loaded from: classes.dex */
public final class p2 implements o2 {
    final int a;
    b2 b;
    j2 c = null;
    int d = Integer.MIN_VALUE;

    private p2(int i, b2 b2Var) {
        this.a = i;
        this.b = b2Var;
        x2.a("TimeSpentRepository: repository created but not initialized. Will initialized when first timespent tick will arrive");
    }

    public static p2 a(int i, y2 y2Var, final Context context) {
        final String g = y2Var.g();
        return new p2(i, new b2() { // from class: xsna.r8z0
            @Override // com.my.tracker.obfuscated.b2
            public final Object a() {
                com.my.tracker.obfuscated.j2 a;
                a = com.my.tracker.obfuscated.p2.a(g, context);
                return a;
            }
        });
    }

    private boolean c() {
        return this.c != null && this.d >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j2 d() {
        return null;
    }

    public void b() {
        if (c()) {
            return;
        }
        x2.a("TimeSpentRepository: initializing repository...");
        try {
            j2 j2Var = (j2) this.b.a();
            this.c = j2Var;
            this.d = j2Var.a();
            this.b = new tgw();
            x2.a("TimeSpentRepository: successfully initialized, current size = " + this.d + ", max size = " + this.a);
        } catch (Exception e) {
            x2.b("TimeSpentRepository: error occured while initialization repository, repository not initialized", e);
            this.c = null;
            this.d = Integer.MIN_VALUE;
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j2 a(String str, Context context) {
        try {
            return j2.a(str, context);
        } catch (Exception e) {
            x2.b("TimeSpentRepository: can't initialize sql database", e);
            throw new RuntimeException(e);
        }
    }

    @Override // com.my.tracker.obfuscated.o2
    public synchronized void a(long j, byte[] bArr) {
        try {
            if (!c()) {
                b();
            }
            if (this.d >= this.a) {
                try {
                    a();
                } catch (Exception e) {
                    x2.b("TimeSpentRepository: free up database failed, can't put new TimeSpentTick (reason: db still full)");
                    throw new Exception(e);
                }
            }
            try {
                long a = this.c.a(j, bArr);
                this.d++;
                x2.a("TimeSpentRepository: successfully stored new tick packet to db, tickPacketId = " + a + " (current db size = " + this.d + ")");
            } catch (Exception e2) {
                x2.b("TimeSpentRepository: something went wrong while saving new tick packet in database, this tick wouldn't be stored");
                throw new Exception(e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.my.tracker.obfuscated.o2
    public synchronized s2[] a(int i) {
        s2[] s2VarArr;
        try {
            j2 j2Var = this.c;
            Objects.requireNonNull(j2Var);
            j2.b b = j2Var.b(i);
            try {
                ArrayList arrayList = new ArrayList(i);
                while (b.b()) {
                    arrayList.add(new s2(b.n(), b.m()));
                }
                x2.a("TimeSpentRepository: read " + arrayList.size() + " freshest packets from db");
                s2VarArr = arrayList.isEmpty() ? null : (s2[]) arrayList.toArray(new s2[0]);
                b.close();
            } finally {
            }
        } catch (Throwable th) {
            x2.b("TimeSpentRepository: error while reading " + i + " freshest tick packets", th);
            return null;
        }
        return s2VarArr;
    }

    @Override // com.my.tracker.obfuscated.o2
    public synchronized void a(long[] jArr) {
        try {
            j2 j2Var = this.c;
            Objects.requireNonNull(j2Var);
            j2Var.a(jArr);
        } catch (Exception unused) {
            String str = "TimeSpentRepository: something went wrong while deleting " + jArr.length + " packets from db";
            x2.b(str);
            throw new Exception(str);
        }
    }

    private void a() {
        int i = (this.d - this.a) + 1;
        try {
            j2 j2Var = this.c;
            Objects.requireNonNull(j2Var);
            int a = j2Var.a(i);
            this.d -= a;
            x2.a("TimeSpentRepository: successfully deleted " + a + "(requested = " + i + ") oldest tick packets from db, currentDbSize = " + this.d + " (reason: need free up space for new packet)");
        } catch (Exception e) {
            StringBuilder b = ji.b(i, "TimeSpentRepository: something went wrong while trying to delete oldest", " tick packets from db (reason: need free up space for new packet, maxSize = ");
            b.append(this.a);
            b.append(", current size = ");
            b.append(this.d);
            b.append("), can't store new tick packet");
            x2.b(b.toString(), e);
            throw new Exception(e);
        }
    }
}
