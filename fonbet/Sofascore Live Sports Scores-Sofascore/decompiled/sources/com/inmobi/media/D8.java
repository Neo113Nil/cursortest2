package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.ad2;
import defpackage.bu3;
import defpackage.fc6;
import defpackage.g51;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.mz1;
import defpackage.ph0;
import defpackage.s9a;
import defpackage.vg6;
import defpackage.xw3;
import defpackage.yda;
import defpackage.z45;
import defpackage.zzl;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class D8 {
    public final HtmlVideoPlayerRequest a;
    public final Hi b;
    public final InterfaceC3880x9 c;
    public final ku3 d;
    public final ku3 e;
    public yda f;
    public final AtomicBoolean g;
    public final WeakReference h;
    public boolean i;
    public final HtmlVideoPlayerConfig j;
    public final V7 k;
    public boolean l;
    public C3682pi m;
    public C3837vi n;
    public boolean o;
    public Mf p;
    public final AtomicReference q;

    public D8(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, AdConfig.HybridNativeConfig hybridNativeConfig, HtmlVideoPlayerRequest htmlVideoPlayerRequest, C3837vi c3837vi, Hi hi, InterfaceC3880x9 interfaceC3880x9) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        hybridNativeConfig.getClass();
        htmlVideoPlayerRequest.getClass();
        this.a = htmlVideoPlayerRequest;
        this.b = hi;
        this.c = interfaceC3880x9;
        C8 c8 = new C8(bu3.a, this);
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(hq4.c.plus(c8));
        this.d = c;
        this.e = X4.a(c, c8);
        this.g = new AtomicBoolean(false);
        this.h = new WeakReference(gestureDetectorOnGestureListenerC3889xi.getContext());
        this.j = htmlVideoPlayerRequest.getConfig();
        Context context = gestureDetectorOnGestureListenerC3889xi.getContext();
        context.getClass();
        this.k = new V7(context, hybridNativeConfig, c, htmlVideoPlayerRequest, interfaceC3880x9);
        this.n = c3837vi;
        this.q = new AtomicReference(A8.INIT);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(AbstractC3712qm abstractC3712qm) {
        D8 d8;
        Hi hi;
        C3837vi c3837vi;
        C3837vi c3837vi2;
        C3682pi c3682pi;
        C3837vi c3837vi3;
        Mf mf;
        Oe oe;
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("HybridVideoPlayerHandler", "handleMediaEvent: " + abstractC3712qm);
        }
        boolean z = abstractC3712qm instanceof Wm;
        if (z) {
            C3837vi c3837vi4 = this.n;
            if (c3837vi4 != null) {
                EnumC3879x8 enumC3879x8 = EnumC3879x8.VIDEO_QUARTILES_EVENT;
                EnumC3465h8[] enumC3465h8Arr = EnumC3465h8.a;
                enumC3879x8.getClass();
                c3837vi4.a.a(enumC3879x8, "q1");
            }
        } else if (abstractC3712qm instanceof Hn) {
            C3837vi c3837vi5 = this.n;
            if (c3837vi5 != null) {
                EnumC3879x8 enumC3879x82 = EnumC3879x8.VIDEO_QUARTILES_EVENT;
                EnumC3465h8[] enumC3465h8Arr2 = EnumC3465h8.a;
                enumC3879x82.getClass();
                c3837vi5.a.a(enumC3879x82, "q2");
            }
        } else if (abstractC3712qm instanceof Qn) {
            C3837vi c3837vi6 = this.n;
            if (c3837vi6 != null) {
                EnumC3879x8 enumC3879x83 = EnumC3879x8.VIDEO_QUARTILES_EVENT;
                EnumC3465h8[] enumC3465h8Arr3 = EnumC3465h8.a;
                enumC3879x83.getClass();
                c3837vi6.a.a(enumC3879x83, "q3");
            }
        } else if (abstractC3712qm instanceof Xm) {
            C3837vi c3837vi7 = this.n;
            if (c3837vi7 != null) {
                EnumC3879x8 enumC3879x84 = EnumC3879x8.VIDEO_QUARTILES_EVENT;
                EnumC3465h8[] enumC3465h8Arr4 = EnumC3465h8.a;
                enumC3879x84.getClass();
                c3837vi7.a.a(enumC3879x84, "q4");
            }
        } else {
            if (!(abstractC3712qm instanceof C3660om)) {
                if (abstractC3712qm instanceof C3646o8) {
                    d8 = this;
                    if (a(d8, new A8[]{A8.LOADING}, null, null, A8.LOADED, 6)) {
                        C3682pi c3682pi2 = d8.m;
                        if (c3682pi2 != null) {
                            HtmlVideoPlaybackState htmlVideoPlaybackState = ((C3646o8) abstractC3712qm).a;
                            htmlVideoPlaybackState.getClass();
                            InterfaceC3880x9 interfaceC3880x92 = c3682pi2.a.i;
                            if (interfaceC3880x92 != null) {
                                ((C3906y9) interfaceC3880x92).b("HtmlVideoPlayer", "onVideoLoadSuccess");
                            }
                            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = c3682pi2.a;
                            EnumC3879x8 enumC3879x85 = EnumC3879x8.VIDEO_READY;
                            htmlVideoPlaybackState.getClass();
                            gestureDetectorOnGestureListenerC3889xi.a(enumC3879x85, AbstractC3907ya.a(htmlVideoPlaybackState, HtmlVideoPlaybackState.class));
                        }
                        if (d8.o) {
                            d8.k.e();
                        }
                    }
                } else {
                    d8 = this;
                    if (abstractC3712qm instanceof C3516j8) {
                        if (a(d8, new A8[]{A8.LOADING}, null, null, A8.LOAD_FAILED, 6) && (c3682pi = d8.m) != null) {
                            c3682pi.a((C3516j8) abstractC3712qm);
                        }
                    } else if (abstractC3712qm instanceof C3698q8) {
                        d8.a(A8.ERROR, (String) null, (String) null);
                        C3837vi c3837vi8 = d8.n;
                        if (c3837vi8 != null) {
                            EnumC3879x8 enumC3879x86 = EnumC3879x8.VIDEO_PLAYBACK_ERROR;
                            JSONObject a = AbstractC3907ya.a(abstractC3712qm, abstractC3712qm.getClass());
                            enumC3879x86.getClass();
                            c3837vi8.a.a(enumC3879x86, a);
                        }
                    } else if (abstractC3712qm instanceof C3635nn) {
                        A8[] a8Arr = {A8.PLAYING};
                        A8 a8 = A8.PAUSED;
                        a(d8, a8Arr, null, null, a8, 6);
                        if (d8.q.get() == a8 && (c3837vi2 = d8.n) != null) {
                            EnumC3879x8 enumC3879x87 = EnumC3879x8.VIDEO_PLAYBACK_STATE;
                            HtmlVideoPlaybackState a2 = d8.k.a();
                            a2.getClass();
                            JSONObject a3 = AbstractC3907ya.a(a2, HtmlVideoPlaybackState.class);
                            enumC3879x87.getClass();
                            c3837vi2.a.a(enumC3879x87, a3);
                        }
                    } else if (abstractC3712qm instanceof Gn) {
                        A8[] a8Arr2 = {A8.LOADED, A8.PAUSED, A8.COMPLETED};
                        A8 a82 = A8.PLAYING;
                        a(d8, a8Arr2, null, null, a82, 6);
                        if (d8.q.get() == a82 && (c3837vi = d8.n) != null) {
                            EnumC3879x8 enumC3879x88 = EnumC3879x8.VIDEO_PLAYBACK_STATE;
                            HtmlVideoPlaybackState a4 = d8.k.a();
                            a4.getClass();
                            JSONObject a5 = AbstractC3907ya.a(a4, HtmlVideoPlaybackState.class);
                            enumC3879x88.getClass();
                            c3837vi.a.a(enumC3879x88, a5);
                        }
                    } else if (abstractC3712qm instanceof Jn) {
                        C3837vi c3837vi9 = d8.n;
                        if (c3837vi9 != null) {
                            EnumC3879x8 enumC3879x89 = EnumC3879x8.VIDEO_QUARTILES_EVENT;
                            EnumC3465h8[] enumC3465h8Arr5 = EnumC3465h8.a;
                            enumC3879x89.getClass();
                            c3837vi9.a.a(enumC3879x89, "q0");
                        }
                    } else if (abstractC3712qm instanceof C3775t8) {
                        C3775t8 c3775t8 = (C3775t8) abstractC3712qm;
                        float f = c3775t8.a / 1000.0f;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time", Float.valueOf(f));
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, Float.valueOf(c3775t8.b / 1000.0f));
                        C3837vi c3837vi10 = d8.n;
                        if (c3837vi10 != null) {
                            EnumC3879x8 enumC3879x810 = EnumC3879x8.VIDEO_PLAYBACK_UPDATE;
                            enumC3879x810.getClass();
                            c3837vi10.a.a(enumC3879x810, jSONObject);
                        }
                    } else if (abstractC3712qm instanceof C3749s8) {
                        C3837vi c3837vi11 = d8.n;
                        if (c3837vi11 != null) {
                            EnumC3879x8 enumC3879x811 = EnumC3879x8.VIDEO_PLAYER_POSITION;
                            VideoViewPosition videoViewPosition = ((C3749s8) abstractC3712qm).a;
                            videoViewPosition.getClass();
                            JSONObject a6 = AbstractC3907ya.a(videoViewPosition, VideoViewPosition.class);
                            enumC3879x811.getClass();
                            c3837vi11.a.a(enumC3879x811, a6);
                        }
                    } else if (abstractC3712qm instanceof C3387e8) {
                        C3837vi c3837vi12 = d8.n;
                        if (c3837vi12 != null) {
                            EnumC3879x8 enumC3879x812 = EnumC3879x8.VIDEO_CAN_PLAY_THROUGH;
                            enumC3879x812.getClass();
                            c3837vi12.a.a(enumC3879x812, (Object) null);
                        }
                    } else if (abstractC3712qm instanceof C3672p8) {
                        C3837vi c3837vi13 = d8.n;
                        if (c3837vi13 != null) {
                            EnumC3879x8 enumC3879x813 = EnumC3879x8.VIDEO_LOADED_METADATA;
                            enumC3879x813.getClass();
                            c3837vi13.a.a(enumC3879x813, (Object) null);
                        }
                    } else if (abstractC3712qm instanceof W1) {
                        C3837vi c3837vi14 = d8.n;
                        if (c3837vi14 != null) {
                            EnumC3879x8 enumC3879x814 = EnumC3879x8.VIDEO_PLAYBACK_STATE;
                            HtmlVideoPlaybackState a7 = d8.k.a();
                            a7.getClass();
                            JSONObject a9 = AbstractC3907ya.a(a7, HtmlVideoPlaybackState.class);
                            enumC3879x814.getClass();
                            c3837vi14.a.a(enumC3879x814, a9);
                        }
                    } else if ((abstractC3712qm instanceof C3905y8) && (hi = d8.b) != null) {
                        Map a10 = hi.a();
                        C3839vk c3839vk = C3839vk.a;
                        C3839vk.b("ViewStateOnParentAttached", a10, EnumC3943zk.SDK);
                    }
                }
                if ((!z || (abstractC3712qm instanceof Hn) || (abstractC3712qm instanceof Qn) || (abstractC3712qm instanceof C3660om) || (abstractC3712qm instanceof Jn) || (abstractC3712qm instanceof C3635nn) || (abstractC3712qm instanceof Gn) || (abstractC3712qm instanceof C3698q8) || (abstractC3712qm instanceof W1)) && (mf = d8.p) != null) {
                    abstractC3712qm.getClass();
                    oe = mf.e;
                    if (oe == null) {
                        oe.a(abstractC3712qm);
                        return;
                    }
                    return;
                }
                return;
            }
            if (a(A8.COMPLETED, (String) null, (String) null) && (c3837vi3 = this.n) != null) {
                EnumC3879x8 enumC3879x815 = EnumC3879x8.VIDEO_COMPLETE;
                enumC3879x815.getClass();
                c3837vi3.a.a(enumC3879x815, (Object) null);
            }
        }
        d8 = this;
        if (z) {
        }
        abstractC3712qm.getClass();
        oe = mf.e;
        if (oe == null) {
        }
    }

    public final void b(boolean z) {
        if (this.g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z ? "show" : "hide");
        A8[] a8Arr = {A8.LOADED, A8.PLAYING, A8.PAUSED, A8.COMPLETED, A8.ERROR};
        EnumC3491i8[] enumC3491i8Arr = EnumC3491i8.a;
        if (a(this, a8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            V7 v7 = this.k;
            if (v7.h.get()) {
                return;
            }
            if (z) {
                v7.e();
            } else {
                v7.f();
            }
            if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                v7.n.setVisibility(z ? 0 : 8);
            } else {
                xw3.L(v7.c, null, null, new G7(null, v7, z), 3);
            }
        }
    }

    public final boolean a(A8[] a8Arr, String str, String str2, A8 a8) {
        A8 a82 = (A8) this.q.get();
        boolean z = false;
        if (!ph0.v(a8Arr, a82)) {
            if (str != null) {
                a(str, String.format("Invalid state (%s) for %s. Allowed: %s", Arrays.copyOf(new Object[]{a82, str2, ph0.K(a8Arr, null, null, null, null, 63)}, 3)), str2);
            }
            return false;
        }
        if (a8 != null && !a(a8, str, str2)) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r5 == com.inmobi.media.A8.i) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (r5 != com.inmobi.media.A8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r5 != com.inmobi.media.A8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        if (r5 != com.inmobi.media.A8.i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        if (r5 == com.inmobi.media.A8.i) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0061, code lost:
    
        if (r5 != com.inmobi.media.A8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0072, code lost:
    
        if (r5 != com.inmobi.media.A8.i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007b, code lost:
    
        if (r5 != com.inmobi.media.A8.i) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(A8 a8, String str, String str2) {
        InterfaceC3880x9 interfaceC3880x9;
        A8 a82 = (A8) this.q.get();
        if (a82 == a8) {
            return true;
        }
        a82.getClass();
        switch (a82.ordinal()) {
            case 0:
                if (a8 != A8.LOADING) {
                    break;
                }
                interfaceC3880x9 = this.c;
                if (interfaceC3880x9 != null) {
                    StringBuilder sb = new StringBuilder("State transition: ");
                    sb.append(a82);
                    sb.append(" -> ");
                    sb.append(a8);
                    sb.append(" (cause=");
                    ((C3906y9) interfaceC3880x9).a("HybridVideoPlayerHandler", mz1.o(sb, str2, ")"));
                }
                this.q.set(a8);
                return true;
            case 1:
                if (a8 != A8.LOADED) {
                    if (a8 != A8.LOAD_FAILED) {
                        if (a8 != A8.ERROR) {
                            break;
                        }
                    }
                }
                interfaceC3880x9 = this.c;
                if (interfaceC3880x9 != null) {
                }
                this.q.set(a8);
                return true;
            case 2:
                if (a8 != A8.PLAYING) {
                    if (a8 != A8.PAUSED) {
                        if (a8 != A8.DESTROYED) {
                            break;
                        }
                    }
                }
                interfaceC3880x9 = this.c;
                if (interfaceC3880x9 != null) {
                }
                this.q.set(a8);
                return true;
            case 3:
                break;
            case 4:
                if (a8 != A8.PAUSED) {
                    if (a8 != A8.COMPLETED) {
                        if (a8 != A8.ERROR) {
                            break;
                        }
                    }
                }
                interfaceC3880x9 = this.c;
                if (interfaceC3880x9 != null) {
                }
                this.q.set(a8);
                return true;
            case 5:
                if (a8 != A8.PLAYING) {
                    if (a8 != A8.DESTROYED) {
                        break;
                    }
                }
                interfaceC3880x9 = this.c;
                if (interfaceC3880x9 != null) {
                }
                this.q.set(a8);
                return true;
            case 6:
                if (a8 != A8.PLAYING) {
                    if (a8 != A8.DESTROYED) {
                        break;
                    }
                }
                interfaceC3880x9 = this.c;
                if (interfaceC3880x9 != null) {
                }
                this.q.set(a8);
                return true;
            case 7:
                break;
            case 8:
                if (str != null) {
                    a(str, String.format("Illegal state transition from %s to %s for %s", Arrays.copyOf(new Object[]{a82, a8, str2 == null ? "state transition" : str2}, 3)), str2);
                }
                A8 a83 = A8.ERROR;
                if (a82 != a83 && a82 != A8.DESTROYED) {
                    this.q.set(a83);
                }
                return false;
            default:
                zzl.b();
                return false;
        }
    }

    public final void a(String str, String str2, String str3) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("HybridVideoPlayerHandler", fc6.n("Manager error (", str, "): ", str2));
        }
        if (this.g.get()) {
            return;
        }
        EnumC3491i8[] enumC3491i8Arr = EnumC3491i8.a;
        if (Intrinsics.c(str, "unknown")) {
            return;
        }
        C3413f8 c3413f8 = new C3413f8(str3);
        C3837vi c3837vi = this.n;
        if (c3837vi != null) {
            EnumC3879x8 enumC3879x8 = EnumC3879x8.VIDEO_COMMAND_ERROR;
            JSONObject a = AbstractC3907ya.a(c3413f8, C3413f8.class);
            enumC3879x8.getClass();
            c3837vi.a.a(enumC3879x8, a);
        }
    }

    public final void a(boolean z) {
        if (this.g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z ? CampaignEx.JSON_NATIVE_VIDEO_MUTE : CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        A8[] a8Arr = {A8.LOADED, A8.PLAYING, A8.PAUSED};
        EnumC3491i8[] enumC3491i8Arr = EnumC3491i8.a;
        if (a(this, a8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            V7 v7 = this.k;
            if (v7.h.get()) {
                return;
            }
            C3284a8 c3284a8 = v7.y;
            if (z) {
                c3284a8.a();
                c3284a8.d.a();
            } else {
                X4.a(c3284a8.a, new Z7(c3284a8, null));
            }
        }
    }

    public final void a() {
        ViewGroup viewGroup;
        if (this.g.getAndSet(true)) {
            return;
        }
        A8 a8 = A8.DESTROYED;
        EnumC3491i8[] enumC3491i8Arr = EnumC3491i8.a;
        a(a8, "executeVideoPlayerActions", (String) null);
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("HybridVideoPlayerHandler", "destroy video player");
        }
        V7 v7 = this.k;
        if (!v7.h.getAndSet(true)) {
            InterfaceC3880x9 interfaceC3880x92 = v7.b;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("HtmlMediaPlayer", "destroy called");
            }
            yda ydaVar = v7.v;
            if (ydaVar != null) {
                ydaVar.e(null);
            }
            v7.v = null;
            v7.l.set(Jg.STATE_DESTROYED);
            v7.g.set(false);
            X4.a(v7.k);
            v7.x.a();
            if (v7.f.get()) {
                v7.f.set(false);
                if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                    ((vg6) v7.p).z(v7.B);
                } else {
                    xw3.L(v7.c, null, null, new Q7(null, v7), 3);
                }
            }
            if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                ((vg6) v7.p).stop();
                ((g51) v7.p).t();
                ((vg6) v7.p).release();
                v7.z.a();
                v7.y.d.d();
            } else {
                xw3.L(v7.c, null, null, new P7(null, v7), 3);
            }
            v7.n.setOnPositionChangeListener(null);
            v7.n.removeAllViews();
            WeakReference weakReference = v7.r;
            if (weakReference != null && (viewGroup = (ViewGroup) weakReference.get()) != null) {
                viewGroup.removeView(v7.n);
            }
            WeakReference weakReference2 = v7.r;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            s9a.o(v7.c, null);
            s9a.o(v7.d, null);
        }
        V7 v72 = this.k;
        v72.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", ((vg6) v72.p).getDuration());
        jSONObject.put("playbackTime", ((vg6) v72.p).getCurrentPosition());
        jSONObject.put("bufferTime", ((vg6) v72.p).getBufferedPosition());
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        Hi hi = this.b;
        if (hi != null) {
            Map a = hi.a();
            a.put("payload", jSONObject2);
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("VideoDestroyed", a, EnumC3943zk.SDK);
        }
        C3837vi c3837vi = this.n;
        if (c3837vi != null) {
            EnumC3879x8 enumC3879x8 = EnumC3879x8.VIDEO_PLAYER_DESTROYED;
            enumC3879x8.getClass();
            c3837vi.a.a(enumC3879x8, (Object) null);
        }
        yda ydaVar2 = this.f;
        if (ydaVar2 != null) {
            ydaVar2.e(null);
        }
        this.f = null;
        this.m = null;
        this.n = null;
    }

    public static /* synthetic */ boolean a(D8 d8, A8[] a8Arr, String str, String str2, A8 a8, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            a8 = null;
        }
        return d8.a(a8Arr, str, str2, a8);
    }
}
