package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzmz;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.b0a;
import defpackage.fc6;
import defpackage.o21;
import defpackage.q21;
import defpackage.tmi;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzmz {
    public final o21 a = q21.f;
    public final tmi b;
    public final tmi c;

    public zzmz(final zzacr zzacrVar, final String str) {
        final int i = 1;
        this.b = b0a.M(new tmi(this) { // from class: fyo
            public final /* synthetic */ zzmz b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.tmi
            public final Object get() {
                long j;
                char c;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                int i2 = i;
                Serializable serializable = zzacrVar;
                zzmz zzmzVar = this.b;
                switch (i2) {
                    case 0:
                        int i3 = r79.a;
                        int i4 = ozc.y;
                        nzc c2 = new nzc().c(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = c2.a;
                        byteBuffer.put((byte) 0);
                        if (byteBuffer.remaining() < 8) {
                            c2.a();
                        }
                        nzc c3 = c2.c("".getBytes());
                        c3.a();
                        ByteBuffer byteBuffer2 = c3.a;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            c3.d = byteBuffer2.remaining() + c3.d;
                            long j8 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ ((byteBuffer2.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ ((byteBuffer2.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c = '\b';
                                    j4 = 0;
                                    j3 = j4 ^ ((byteBuffer2.get(3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    c = '\b';
                                    j5 = 0;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    j6 = 0;
                                    c = '\b';
                                    j5 = ((byteBuffer2.get(5) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    j6 = (byteBuffer2.get(6) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 48;
                                    c = '\b';
                                    j5 = ((byteBuffer2.get(5) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 10:
                                    j8 ^= (byteBuffer2.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 11:
                                    j8 ^= (byteBuffer2.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                    j8 ^= (byteBuffer2.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 12:
                                    j8 ^= (byteBuffer2.get(11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                    j8 ^= (byteBuffer2.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                    j8 ^= (byteBuffer2.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 13:
                                    j8 ^= (byteBuffer2.get(12) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 32;
                                    j8 ^= (byteBuffer2.get(11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                    j8 ^= (byteBuffer2.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                    j8 ^= (byteBuffer2.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    j8 ^= (byteBuffer2.get(13) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 40;
                                    j8 ^= (byteBuffer2.get(12) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 32;
                                    j8 ^= (byteBuffer2.get(11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                    j8 ^= (byteBuffer2.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                    j8 ^= (byteBuffer2.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j8 = (byteBuffer2.get(14) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 48;
                                    j8 ^= (byteBuffer2.get(13) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 40;
                                    j8 ^= (byteBuffer2.get(12) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 32;
                                    j8 ^= (byteBuffer2.get(11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                    j8 ^= (byteBuffer2.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                    j8 ^= (byteBuffer2.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    a70.j("Should never get here.");
                                    return null;
                            }
                        }
                        long j9 = c3.b;
                        long j10 = c3.d;
                        long j11 = j9 ^ j10;
                        long j12 = j10 ^ c3.c;
                        long j13 = j11 + j12;
                        long j14 = j12 + j13;
                        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                        long j19 = j18 ^ (j18 >>> 33);
                        long j20 = (j16 ^ (j16 >>> 33)) + j19;
                        c3.b = j20;
                        c3.c = j19 + j20;
                        byte[] array = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(c3.b).putLong(c3.c).array();
                        array.getClass();
                        return zzmzVar.a.c((byte[]) array.clone());
                    default:
                        return zzmzVar.a.c(((zzacr) serializable).s());
                }
            }
        });
        final int i2 = 0;
        this.c = b0a.M(new tmi(this) { // from class: fyo
            public final /* synthetic */ zzmz b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.tmi
            public final Object get() {
                long j;
                char c;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                int i22 = i2;
                Serializable serializable = str;
                zzmz zzmzVar = this.b;
                switch (i22) {
                    case 0:
                        int i3 = r79.a;
                        int i4 = ozc.y;
                        nzc c2 = new nzc().c(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = c2.a;
                        byteBuffer.put((byte) 0);
                        if (byteBuffer.remaining() < 8) {
                            c2.a();
                        }
                        nzc c3 = c2.c("".getBytes());
                        c3.a();
                        ByteBuffer byteBuffer2 = c3.a;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            c3.d = byteBuffer2.remaining() + c3.d;
                            long j8 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ ((byteBuffer2.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ ((byteBuffer2.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c = '\b';
                                    j4 = 0;
                                    j3 = j4 ^ ((byteBuffer2.get(3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    c = '\b';
                                    j5 = 0;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    j6 = 0;
                                    c = '\b';
                                    j5 = ((byteBuffer2.get(5) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    j6 = (byteBuffer2.get(6) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 48;
                                    c = '\b';
                                    j5 = ((byteBuffer2.get(5) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 10:
                                    j8 ^= (byteBuffer2.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 11:
                                    j8 ^= (byteBuffer2.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                    j8 ^= (byteBuffer2.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 12:
                                    j8 ^= (byteBuffer2.get(11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                    j8 ^= (byteBuffer2.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                    j8 ^= (byteBuffer2.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 13:
                                    j8 ^= (byteBuffer2.get(12) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 32;
                                    j8 ^= (byteBuffer2.get(11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                    j8 ^= (byteBuffer2.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                    j8 ^= (byteBuffer2.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    j8 ^= (byteBuffer2.get(13) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 40;
                                    j8 ^= (byteBuffer2.get(12) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 32;
                                    j8 ^= (byteBuffer2.get(11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                    j8 ^= (byteBuffer2.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                    j8 ^= (byteBuffer2.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j8 = (byteBuffer2.get(14) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 48;
                                    j8 ^= (byteBuffer2.get(13) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 40;
                                    j8 ^= (byteBuffer2.get(12) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 32;
                                    j8 ^= (byteBuffer2.get(11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                    j8 ^= (byteBuffer2.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                    j8 ^= (byteBuffer2.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    j8 ^= byteBuffer2.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    a70.j("Should never get here.");
                                    return null;
                            }
                        }
                        long j9 = c3.b;
                        long j10 = c3.d;
                        long j11 = j9 ^ j10;
                        long j12 = j10 ^ c3.c;
                        long j13 = j11 + j12;
                        long j14 = j12 + j13;
                        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                        long j19 = j18 ^ (j18 >>> 33);
                        long j20 = (j16 ^ (j16 >>> 33)) + j19;
                        c3.b = j20;
                        c3.c = j19 + j20;
                        byte[] array = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(c3.b).putLong(c3.c).array();
                        array.getClass();
                        return zzmzVar.a.c((byte[]) array.clone());
                    default:
                        return zzmzVar.a.c(((zzacr) serializable).s());
                }
            }
        });
    }

    public final File a() {
        String str = (String) this.b.get();
        String str2 = (String) this.c.get();
        return new File(fc6.o(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
    }
}
