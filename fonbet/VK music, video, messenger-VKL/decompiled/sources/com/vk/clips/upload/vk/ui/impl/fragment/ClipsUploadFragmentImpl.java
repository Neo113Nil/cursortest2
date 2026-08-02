package com.vk.clips.upload.vk.ui.impl.fragment;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.u;
import com.vk.clips.attachments.api.main.video.ClipsVideoAttachmentData;
import com.vk.clips.attachments.api.publish.cta.ClipsCtaAttachEntryParams;
import com.vk.clips.attachments.api.publish.geolocation.ClipsGeolocationAttachEntryParams;
import com.vk.clips.attachments.api.publish.links.ClipsLinksAttachEntryParams;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectInputModel;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectorInputParams;
import com.vk.clips.coauthors.domain.model.CoauthorType;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.model.PlaylistRawId;
import com.vk.clips.upload.vk.ui.api.ClipsUploadScreenStaticConfig;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipAttachedVideoInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteUnavailabilityTarget;
import com.vk.clips.upload.vk.ui.impl.fragment.utils.resulter.ActivityResultType;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.transition.TransitionOption$Type;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.Price;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.ecomm.configureitemlist.api.model.ConfigureItem;
import com.vk.ecomm.configureitemlist.api.model.ConfigureItemId;
import com.vk.ecomm.products_multipicker.api.MarketMultiPickerSource;
import com.vk.movika.sdk.base.observable.e0;
import com.vk.movika.sdk.base.ui.i;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.video.channel.createchannel.data.ChannelCreateScreenSourceArgs;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a0a;
import xsna.aa5;
import xsna.abf;
import xsna.aeg0;
import xsna.atd0;
import xsna.b0j;
import xsna.b6l;
import xsna.bap;
import xsna.bbf;
import xsna.bc6;
import xsna.bpn0;
import xsna.c5g;
import xsna.cbf;
import xsna.cpu;
import xsna.cvk;
import xsna.dbf;
import xsna.de4;
import xsna.dj1;
import xsna.e3m;
import xsna.eb0;
import xsna.ebf;
import xsna.enj;
import xsna.epx;
import xsna.f1;
import xsna.f5z;
import xsna.fgf;
import xsna.fkq0;
import xsna.g5z;
import xsna.g910;
import xsna.gbf;
import xsna.gd60;
import xsna.h7u0;
import xsna.hbf;
import xsna.hd60;
import xsna.hjf;
import xsna.hqu0;
import xsna.hwo;
import xsna.i5f;
import xsna.i5s;
import xsna.ibf;
import xsna.iff;
import xsna.imf;
import xsna.izs;
import xsna.j5g;
import xsna.jbf;
import xsna.jmd;
import xsna.jnd;
import xsna.jx0;
import xsna.kai;
import xsna.kbf;
import xsna.kf1;
import xsna.kgn;
import xsna.kld;
import xsna.ksr;
import xsna.lbf;
import xsna.lsr;
import xsna.m2;
import xsna.maz;
import xsna.msy;
import xsna.myc0;
import xsna.nbs;
import xsna.ng1;
import xsna.o1c;
import xsna.oap;
import xsna.oef;
import xsna.ood;
import xsna.oz50;
import xsna.p180;
import xsna.pef;
import xsna.pff;
import xsna.pr1;
import xsna.pvj;
import xsna.px0;
import xsna.qc;
import xsna.qdf;
import xsna.qef;
import xsna.qje;
import xsna.r180;
import xsna.rdf;
import xsna.rff;
import xsna.rj1;
import xsna.rj7;
import xsna.rwi;
import xsna.s3q0;
import xsna.s4z;
import xsna.s9;
import xsna.sef;
import xsna.sff;
import xsna.spj;
import xsna.t40;
import xsna.tb0;
import xsna.tff;
import xsna.uh3;
import xsna.v9;
import xsna.vds;
import xsna.vff;
import xsna.wh50;
import xsna.wzs;
import xsna.xa4;
import xsna.xas0;
import xsna.xud;
import xsna.y6;
import xsna.yaf;
import xsna.yc;
import xsna.yff;
import xsna.yok0;
import xsna.yud;
import xsna.yvj;
import xsna.yzs;
import xsna.z37;
import xsna.zaf;
import xsna.zak0;
import xsna.zj0;
import xsna.zq2;
import xsna.zvj;

/* compiled from: ClipsUploadFragmentImpl.kt */
/* loaded from: classes.dex */
public final class ClipsUploadFragmentImpl extends FragmentImpl implements r180, vds, tb0 {
    public static final String a0 = i5s.a(new StringBuilder("https://"), a0a.d, "/terms/clips");
    public final Object N;
    public final Object O;
    public final nbs P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final wh50 Z;

    /* compiled from: ClipsUploadFragmentImpl.kt */
    /* loaded from: classes17.dex */
    public static final class a extends oz50 {
        /* JADX WARN: Multi-variable type inference failed */
        public a(oap<ClipsUploadUiVkNavigator.ClipUploadDataFull, ClipsUploadUiVkNavigator.ClipUploadDataCompact> oapVar, ClipsUploadScreenStaticConfig clipsUploadScreenStaticConfig) {
            super(ClipsUploadFragmentImpl.class, null, null);
            if (oapVar instanceof oap.b) {
                this.j.putParcelable("upload_params_compact", (ClipsUploadUiVkNavigator.ClipUploadDataCompact) ((oap.b) oapVar).a);
            } else {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.j.putParcelable("upload_params_sdk", (ClipsUploadUiVkNavigator.ClipUploadDataFull) ((oap.a) oapVar).a);
            }
            this.j.putParcelable("clip_upload_screen_static_config", clipsUploadScreenStaticConfig);
            s(true);
            u(TransitionOption$Type.TRANSITION_SLIDE_FROM_RIGHT.h());
        }
    }

    /* compiled from: ClipsUploadFragmentImpl.kt */
    @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$SdkActionsHandler$1$1$job$2", f = "ClipsUploadFragmentImpl.kt", l = {326}, m = "invokeSuspend")
    /* loaded from: classes17.dex */
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Object $actionsFlow;
        final /* synthetic */ f5z $lifecycleOwner;
        final /* synthetic */ z37<lbf> $this_SdkActionsHandler;
        int label;

        /* compiled from: ClipsUploadFragmentImpl.kt */
        @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$SdkActionsHandler$1$1$job$2$1", f = "ClipsUploadFragmentImpl.kt", l = {327}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ Object $actionsFlow;
            final /* synthetic */ z37<lbf> $this_SdkActionsHandler;
            int label;

            /* compiled from: ClipsUploadFragmentImpl.kt */
            /* renamed from: com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$b$a$a, reason: collision with other inner class name */
            public static final class C0703a<T> implements lsr {
                public final /* synthetic */ z37<lbf> b;

                public C0703a(z37<lbf> z37Var) {
                    this.b = z37Var;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.lsr
                public final Object emit(Object obj, spj spjVar) {
                    lbf dVar;
                    yaf yafVar = (yaf) obj;
                    if (yafVar instanceof yaf.a) {
                        yaf.a aVar = (yaf.a) yafVar;
                        if (aVar instanceof yaf.a.C4087a) {
                            dVar = new lbf.a.b(((yaf.a.C4087a) aVar).a);
                        } else if (aVar instanceof yaf.a.b) {
                            dVar = new lbf.a.c(((yaf.a.b) aVar).a);
                        } else if (aVar instanceof yaf.a.i) {
                            yaf.a.i iVar = (yaf.a.i) aVar;
                            dVar = new lbf.a.f(iVar.a, iVar.b, iVar.c);
                        } else if (aVar instanceof yaf.a.d) {
                            dVar = new lbf.a.C3246a(new UserId(((yaf.a.d) aVar).a), 6);
                        } else if (epx.f(aVar, yaf.a.e.a)) {
                            dVar = lbf.a.e.b;
                        } else if (epx.f(aVar, yaf.a.f.a)) {
                            dVar = lbf.b.a.b;
                        } else if (epx.f(aVar, yaf.a.h.a)) {
                            dVar = lbf.b.f.b;
                        } else if (epx.f(aVar, yaf.a.c.a)) {
                            dVar = lbf.a.i.b;
                        } else {
                            if (!(aVar instanceof yaf.a.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar = new lbf.b.c(((yaf.a.g) aVar).a);
                        }
                    } else if (yafVar instanceof yaf.c) {
                        yaf.c cVar = (yaf.c) yafVar;
                        if (epx.f(cVar, yaf.c.a.a)) {
                            dVar = lbf.b.d.b;
                        } else if (epx.f(cVar, yaf.c.e.a)) {
                            dVar = lbf.b.e.b;
                        } else if (epx.f(cVar, yaf.c.g.a)) {
                            dVar = lbf.c.n.a.b;
                        } else if (epx.f(cVar, yaf.c.i.a)) {
                            dVar = lbf.b.C3248b.b;
                        } else if (epx.f(cVar, yaf.c.C4089c.a)) {
                            dVar = lbf.c.d.b;
                        } else if (epx.f(cVar, yaf.c.d.a)) {
                            dVar = lbf.c.h.b;
                        } else {
                            if (!epx.f(cVar, yaf.c.h.a)) {
                                if (cVar instanceof bbf) {
                                    dVar = new lbf.c.g.b(((bbf) cVar).a);
                                } else if (cVar instanceof cbf) {
                                    dVar = lbf.c.g.a.b;
                                } else if (epx.f(cVar, zaf.a)) {
                                    dVar = kbf.b;
                                } else if (cVar instanceof abf) {
                                    dVar = new jbf(((abf) cVar).a);
                                } else if (epx.f(cVar, yaf.c.f.a)) {
                                    dVar = lbf.b.i.b;
                                } else if (!(cVar instanceof yaf.c.j)) {
                                    if (epx.f(cVar, ebf.a)) {
                                        dVar = lbf.b.h.b;
                                    } else if (epx.f(cVar, dbf.a)) {
                                        dVar = lbf.c.u.b;
                                    } else {
                                        if (!epx.f(cVar, yaf.c.b.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        dVar = lbf.c.f.b.b;
                                    }
                                }
                            }
                            dVar = null;
                        }
                    } else {
                        if (!(yafVar instanceof yaf.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        yaf.b bVar = (yaf.b) yafVar;
                        switch (sef.a.$EnumSwitchMapping$0[((ClipsUploadFeatureCell) ClipsUploadFeatureCell.h().get(bVar.getId())).ordinal()]) {
                            case 1:
                                if (!(bVar instanceof yaf.b.C4088b)) {
                                    if (!(bVar instanceof yaf.b.e)) {
                                        if (bVar instanceof yaf.b.f) {
                                            dVar = new lbf.c.i.d(((yaf.b.f) bVar).a);
                                            break;
                                        }
                                        dVar = null;
                                        break;
                                    } else {
                                        dVar = lbf.c.i.C3253c.b;
                                        break;
                                    }
                                } else {
                                    dVar = lbf.c.i.b.b;
                                    break;
                                }
                            case 2:
                                if (bVar instanceof yaf.b.C4088b) {
                                    dVar = new lbf.c.s.a(false);
                                    break;
                                }
                                dVar = null;
                                break;
                            case 3:
                                if (!(bVar instanceof yaf.b.C4088b)) {
                                    if (!(bVar instanceof yaf.b.e)) {
                                        if (bVar instanceof yaf.b.c) {
                                            dVar = lbf.c.k.b.b;
                                            break;
                                        }
                                        dVar = null;
                                        break;
                                    } else {
                                        dVar = lbf.c.k.d.b;
                                        break;
                                    }
                                } else {
                                    dVar = lbf.c.k.a.b;
                                    break;
                                }
                            case 4:
                                if (!(bVar instanceof yaf.b.C4088b)) {
                                    if (!(bVar instanceof yaf.b.e)) {
                                        if (bVar instanceof yaf.b.h) {
                                            dVar = lbf.c.e.d.b;
                                            break;
                                        }
                                        dVar = null;
                                        break;
                                    } else {
                                        dVar = lbf.c.e.b.b;
                                        break;
                                    }
                                } else {
                                    dVar = lbf.c.e.a.b;
                                    break;
                                }
                            case 5:
                                if (!(bVar instanceof yaf.b.C4088b)) {
                                    if (bVar instanceof yaf.b.e) {
                                        dVar = lbf.c.o.b.b;
                                        break;
                                    }
                                    dVar = null;
                                    break;
                                } else {
                                    dVar = lbf.c.o.a.b;
                                    break;
                                }
                            case 6:
                                if (bVar instanceof yaf.b.C4088b) {
                                    dVar = lbf.c.l.a.b;
                                    break;
                                }
                                dVar = null;
                                break;
                            case 7:
                                if (!(bVar instanceof yaf.b.C4088b)) {
                                    if (!(bVar instanceof yaf.b.e)) {
                                        if (!(bVar instanceof yaf.b.h)) {
                                            if (bVar instanceof yaf.b.g) {
                                                dVar = lbf.c.a.f.b;
                                                break;
                                            }
                                            dVar = null;
                                            break;
                                        } else {
                                            dVar = lbf.c.a.h.b;
                                            break;
                                        }
                                    } else {
                                        dVar = lbf.c.a.d.b;
                                        break;
                                    }
                                } else {
                                    dVar = lbf.c.a.C3249a.b;
                                    break;
                                }
                            case 8:
                                if (!(bVar instanceof yaf.b.C4088b)) {
                                    if (bVar instanceof yaf.b.e) {
                                        dVar = lbf.c.v.b.b;
                                        break;
                                    }
                                    dVar = null;
                                    break;
                                } else {
                                    dVar = lbf.c.v.a.b;
                                    break;
                                }
                            case 9:
                                if (bVar instanceof yaf.b.d) {
                                    dVar = new lbf.c.j(((yaf.b.d) bVar).b);
                                    break;
                                }
                                dVar = null;
                                break;
                            case 10:
                                if (bVar instanceof yaf.b.a) {
                                    dVar = lbf.c.m.b;
                                    break;
                                }
                                dVar = null;
                                break;
                            case 11:
                                if (!(bVar instanceof yaf.b.h)) {
                                    if (!(bVar instanceof yaf.b.g)) {
                                        if (bVar instanceof yaf.b.C4088b) {
                                            dVar = hbf.b;
                                            break;
                                        }
                                        dVar = null;
                                        break;
                                    } else {
                                        dVar = hbf.b;
                                        break;
                                    }
                                } else {
                                    dVar = ibf.b;
                                    break;
                                }
                            case 12:
                                if (bVar instanceof yaf.b.C4088b) {
                                    dVar = gbf.b;
                                    break;
                                }
                                dVar = null;
                                break;
                            case 13:
                                if (bVar instanceof yaf.b.e) {
                                    dVar = lbf.c.t.b;
                                    break;
                                }
                                dVar = null;
                                break;
                            case 14:
                            case 15:
                                dVar = null;
                                break;
                            case 16:
                                if (bVar instanceof yaf.b.C4088b) {
                                    dVar = lbf.c.a.i.b;
                                    break;
                                }
                                dVar = null;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (dVar != null) {
                        this.b.b(dVar);
                    }
                    return s3q0.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, z37<lbf> z37Var, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$actionsFlow = obj;
                this.$this_SdkActionsHandler = z37Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.$actionsFlow, this.$this_SdkActionsHandler, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    ksr ksrVar = (ksr) this.$actionsFlow;
                    C0703a c0703a = new C0703a(this.$this_SdkActionsHandler);
                    this.label = 1;
                    if (ksrVar.collect(c0703a, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f5z f5zVar, Object obj, z37<lbf> z37Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$lifecycleOwner = f5zVar;
            this.$actionsFlow = obj;
            this.$this_SdkActionsHandler = z37Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$lifecycleOwner, this.$actionsFlow, this.$this_SdkActionsHandler, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                f5z f5zVar = this.$lifecycleOwner;
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar = new a(this.$actionsFlow, this.$this_SdkActionsHandler, null);
                this.label = 1;
                if (u.a(f5zVar, state, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes17.dex */
    public static final class c extends kotlin.coroutines.a implements pvj {
        @Override // xsna.pvj
        public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
    }

    /* compiled from: Effects.kt */
    /* loaded from: classes17.dex */
    public static final class d implements kgn {
        public final /* synthetic */ yok0 a;

        public d(yok0 yok0Var) {
            this.a = yok0Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.b(null);
        }
    }

    /* compiled from: ClipsUploadFragmentImpl.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ActivityResultType.values().length];
            try {
                iArr[ActivityResultType.AttachVideo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityResultType.Preview.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivityResultType.MarketItem.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivityResultType.Editor.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActivityResultType.CoverSelector.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EasyPromoteUnavailabilityTarget.values().length];
            try {
                iArr2[EasyPromoteUnavailabilityTarget.EASY_PROMOTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EasyPromoteUnavailabilityTarget.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: ClipsUploadFragmentImpl.kt */
    @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$onCreateView$1$1$1$2$1", f = "ClipsUploadFragmentImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes17.dex */
    public static final class f extends SuspendLambda implements yzs<z37<lbf>, qef, spj<? super s3q0>, Object> {
        final /* synthetic */ hjf $uploadStore;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(hjf hjfVar, spj<? super f> spjVar) {
            super(3, spjVar);
            this.$uploadStore = hjfVar;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<lbf> z37Var, qef qefVar, spj<? super s3q0> spjVar) {
            f fVar = ClipsUploadFragmentImpl.this.new f(this.$uploadStore, spjVar);
            fVar.L$0 = qefVar;
            return fVar.invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            Iterator it;
            String str;
            ConfigureItem.Owner owner;
            boolean z;
            boolean z2;
            Image image;
            ConfigureItem.Moderation.Reject reject;
            qef qefVar = (qef) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ClipsUploadFragmentImpl clipsUploadFragmentImpl = ClipsUploadFragmentImpl.this;
            hjf hjfVar = this.$uploadStore;
            String str2 = ClipsUploadFragmentImpl.a0;
            clipsUploadFragmentImpl.getClass();
            int i2 = 0;
            if (epx.f(qefVar, qef.a.a)) {
                clipsUploadFragmentImpl.Mf(0, null);
            } else if (epx.f(qefVar, qef.n.a)) {
                ClipsUploadState currentState = hjfVar.getCurrentState();
                ClipsUploadState.Loaded loaded = currentState instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState : null;
                if (loaded != null) {
                    EasyPromoteData easyPromoteData = loaded.b.e.k.b;
                    if (easyPromoteData != null && easyPromoteData.d) {
                        yud yudVar = (yud) clipsUploadFragmentImpl.X.getValue();
                        Integer valueOf = Integer.valueOf(loaded.h);
                        yudVar.getClass();
                        myc0.h(zvj.a(hqu0.a()), null, null, new xud(yudVar, valueOf, null), 3);
                    }
                    clipsUploadFragmentImpl.Mf(-1, null);
                }
            } else if (epx.f(qefVar, qef.o.a)) {
                clipsUploadFragmentImpl.Mf(-1, null);
            } else if (epx.f(qefVar, qef.l.a)) {
                if (clipsUploadFragmentImpl.fo().c().i()) {
                    clipsUploadFragmentImpl.fo().g().getBrowser().f(clipsUploadFragmentImpl.requireContext(), null, LaunchContext.A, ClipsUploadFragmentImpl.a0);
                } else {
                    clipsUploadFragmentImpl.fo().k().D4(clipsUploadFragmentImpl.requireContext());
                }
            } else if (epx.f(qefVar, qef.j.a)) {
                ClipsUploadState currentState2 = hjfVar.getCurrentState();
                ClipsUploadState.Loaded loaded2 = currentState2 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState2 : null;
                if (loaded2 != null) {
                    myc0.h(g5z.a(clipsUploadFragmentImpl), null, null, new yff(clipsUploadFragmentImpl, loaded2, null), 3);
                }
            } else if (epx.f(qefVar, qef.q.a)) {
                FragmentManager childFragmentManager = clipsUploadFragmentImpl.getChildFragmentManager();
                childFragmentManager.l0("geo_result", clipsUploadFragmentImpl, new jx0(childFragmentManager, hjfVar));
                clipsUploadFragmentImpl.fo().a().b().a(childFragmentManager, clipsUploadFragmentImpl.requireContext(), new ClipsGeolocationAttachEntryParams(EmptyList.b, "geo_bundle", "geo_result"));
            } else if (epx.f(qefVar, qef.y.a)) {
                rdf rdfVar = (rdf) clipsUploadFragmentImpl.U.getValue();
                rdfVar.getClass();
                int i3 = h7u0.p;
                h7u0.a c = h7u0.b.c(rdfVar.a);
                c.g0(R.string.clips_publish_with_coauthors_alert_title);
                c.U(R.string.clips_publish_with_coauthors_alert_message);
                c.c0(R.string.clips_publish_with_coauthors_alert_delete, new qdf(hjfVar, i2));
                c.W(R.string.clips_publish_with_coauthors_alert_cancel, new o1c());
                c.m();
            } else if (qefVar instanceof qef.v) {
                gd60.j(hd60.a(), clipsUploadFragmentImpl.requireContext(), ((qef.v) qefVar).a, new s9(hjfVar, 28), new de4(11), MobileOfficialAppsCoreNavStat$EventScreen.STORY_FRIENDS_SEND, null, null, null, false, 736);
            } else if (qefVar instanceof qef.g) {
                maz.c(clipsUploadFragmentImpl.fo().b().p().e(), clipsUploadFragmentImpl.requireContext(), ((qef.g) qefVar).a, LaunchContext.A, null, null, 24);
            } else if (qefVar instanceof qef.c0) {
                cvk.u(R.string.default_network_error, false);
            } else if (qefVar instanceof qef.b0) {
                clipsUploadFragmentImpl.fo().a().a().b(clipsUploadFragmentImpl.getChildFragmentManager());
            } else {
                if (qefVar instanceof qef.r) {
                    clipsUploadFragmentImpl.getChildFragmentManager().l0("geo_result", clipsUploadFragmentImpl, new vff(clipsUploadFragmentImpl, hjfVar));
                    qje a = clipsUploadFragmentImpl.fo().a().a();
                    ClipsLinkAttachment clipsLinkAttachment = ((qef.r) qefVar).a;
                    String str3 = clipsLinkAttachment != null ? clipsLinkAttachment.b : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = clipsLinkAttachment != null ? clipsLinkAttachment.c : null;
                    a.a(new ClipsLinksAttachEntryParams(str3, str4 != null ? str4 : "", "geo_bundle", "geo_result"), clipsUploadFragmentImpl.getChildFragmentManager());
                } else {
                    int i4 = 7;
                    if (qefVar instanceof qef.p) {
                        rdf rdfVar2 = (rdf) clipsUploadFragmentImpl.U.getValue();
                        qef.p pVar = (qef.p) qefVar;
                        FragmentManager fragmentManager = rdfVar2.c;
                        fragmentManager.l0("co_request", rdfVar2.b, new zj0(hjfVar, i4));
                        jmd e = ((ClipsCoauthorsComponent) rdfVar2.e.getValue()).e();
                        Context context = rdfVar2.a;
                        List<CoOwnerItem> list = pVar.a;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        for (CoOwnerItem coOwnerItem : list) {
                            UserId userId = coOwnerItem.b;
                            Owner owner2 = coOwnerItem.d;
                            String str5 = owner2.c;
                            if (str5 == null) {
                                str5 = "";
                            }
                            String str6 = owner2.d;
                            if (str6 == null) {
                                str6 = "";
                            }
                            arrayList.add(new ClipsCoauthorsSelectInputModel(userId, str5, str6, coOwnerItem.e, fkq0.b(owner2.b) ? CoauthorType.Community : owner2.l() ? CoauthorType.Female : CoauthorType.Male));
                        }
                        e.b(context, new ClipsCoauthorsSelectorInputParams(false, j5g.S0(arrayList), "co_request", "co_result", pVar.b, false, null, new ClipsCoauthorsSelectorInputParams.OpenFrom.Clips(null, 1, null), 64, null), fragmentManager);
                    } else if (qefVar instanceof qef.z) {
                        rdf rdfVar3 = (rdf) clipsUploadFragmentImpl.U.getValue();
                        qef.z zVar = (qef.z) qefVar;
                        rdfVar3.getClass();
                        UserId userId2 = zVar.a;
                        jnd.a bVar = fkq0.b(userId2) ? new jnd.a.b(userId2) : zVar.b.b != PostingVisibilityMode.ALL ? jnd.a.C3128a.a : new jnd.a.b(userId2);
                        ((ClipsCoauthorsComponent) rdfVar3.e.getValue()).Fc().b(bVar, new uh3(i4, bVar, hjfVar));
                    } else if (qefVar instanceof qef.e0) {
                        UserId userId3 = ((qef.e0) qefVar).a;
                        int i5 = h7u0.p;
                        h7u0.a c2 = h7u0.b.c(clipsUploadFragmentImpl.requireContext());
                        c2.a.f = clipsUploadFragmentImpl.requireContext().getString(R.string.clips_publish_change_author_dialog_description);
                        c2.h0(clipsUploadFragmentImpl.requireContext().getString(R.string.clips_publish_change_author_dialog_title));
                        c2.X(clipsUploadFragmentImpl.requireContext().getString(R.string.clips_publish_change_author_dialog_cancel), null);
                        c2.d0(clipsUploadFragmentImpl.requireContext().getString(R.string.clips_publish_change_author_dialog_change), new tff(i2, hjfVar, userId3));
                        c2.m();
                    } else if (qefVar instanceof qef.u) {
                        qef.u uVar = (qef.u) qefVar;
                        clipsUploadFragmentImpl.getChildFragmentManager().l0("playlist_request", clipsUploadFragmentImpl, new sff(clipsUploadFragmentImpl, hjfVar));
                        Integer num = uVar.a;
                        ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams = new ClipsPlaylistsFolderLaunchParams(new ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick(null, num != null ? Collections.singleton(new PlaylistRawId(uVar.b, num.intValue())) : null), false, "playlist_request", Collections.singletonList(uVar.b));
                        com.vk.clips.playlists.a aVar = (com.vk.clips.playlists.a) clipsUploadFragmentImpl.fo().s.getValue();
                        clipsUploadFragmentImpl.requireContext();
                        aVar.e(clipsPlaylistsFolderLaunchParams, clipsUploadFragmentImpl.getChildFragmentManager());
                    } else if (qefVar instanceof qef.i) {
                        qef.i iVar = (qef.i) qefVar;
                        int i6 = 27;
                        ((atd0) clipsUploadFragmentImpl.fo().u.getValue()).a(clipsUploadFragmentImpl.requireContext(), new g910(null, 0, null, iVar.a, new t40(hjfVar, i6), 0, iVar.b, MarketMultiPickerSource.CLIP_POSTING, null, null, null, new v9(clipsUploadFragmentImpl, i6), 7255));
                    } else if (qefVar instanceof qef.h) {
                        bc6 L = xa4.L(clipsUploadFragmentImpl.kn());
                        b0j b0jVar = (b0j) clipsUploadFragmentImpl.fo().t.getValue();
                        Context requireContext = clipsUploadFragmentImpl.requireContext();
                        qef.h hVar = (qef.h) qefVar;
                        List<Good> list2 = hVar.a;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            Good good = (Good) it2.next();
                            ConfigureItemId configureItemId = new ConfigureItemId(good.b, good.c);
                            String str7 = good.d;
                            Price price = good.h;
                            ConfigureItem.ProductPrice productPrice = new ConfigureItem.ProductPrice(price.e, price.f, price.i, price.g);
                            Image image2 = good.n;
                            boolean Bb = good.Bb();
                            boolean z3 = good.J;
                            String str8 = good.K;
                            String str9 = good.d0;
                            Owner owner3 = good.M;
                            if (owner3 != null) {
                                it = it2;
                                UserId userId4 = owner3.b;
                                str = str8;
                                String str10 = owner3.c;
                                VerifyInfo verifyInfo = owner3.f;
                                owner = new ConfigureItem.Owner(userId4, str10, verifyInfo != null ? verifyInfo.b : false);
                            } else {
                                it = it2;
                                str = str8;
                                owner = null;
                            }
                            MarketItemRating marketItemRating = good.t;
                            ConfigureItem.Rating rating = marketItemRating != null ? new ConfigureItem.Rating(marketItemRating.b, marketItemRating.c, marketItemRating.d) : null;
                            boolean z4 = good.h0;
                            boolean z5 = good.g0;
                            boolean z6 = good.i0;
                            Image image3 = good.n;
                            MarketRejectInfo marketRejectInfo = good.e0;
                            if (marketRejectInfo != null) {
                                z = z5;
                                z2 = z6;
                                image = image3;
                                reject = new ConfigureItem.Moderation.Reject(marketRejectInfo.c, marketRejectInfo.d, marketRejectInfo.e, marketRejectInfo.g);
                            } else {
                                z = z5;
                                z2 = z6;
                                image = image3;
                                reject = null;
                            }
                            arrayList2.add(new ConfigureItem(configureItemId, str7, productPrice, image2, Bb, z3, str, str9, owner, rating, new ConfigureItem.Moderation(z4, z, z2, null, image, reject)));
                            it2 = it;
                        }
                        L.D(b0jVar.a(requireContext, arrayList2, hVar.b), ActivityResultType.MarketItem.ordinal(), null);
                    } else if (qefVar instanceof qef.f) {
                        qef.f fVar = (qef.f) qefVar;
                        clipsUploadFragmentImpl.getParentFragmentManager().l0("cta_request", clipsUploadFragmentImpl, new rff(clipsUploadFragmentImpl, hjfVar));
                        ood c3 = clipsUploadFragmentImpl.fo().a().c();
                        ClipsCtaAttachEntryParams clipsCtaAttachEntryParams = new ClipsCtaAttachEntryParams(fVar.a, fVar.b, fVar.d, fVar.c, "cta_result", "cta_request", fVar.e, fVar.f);
                        clipsUploadFragmentImpl.getParentFragmentManager();
                        c3.a(clipsCtaAttachEntryParams, clipsUploadFragmentImpl.requireContext());
                        if (fVar.c) {
                            hjfVar.b(lbf.c.a.C3250c.b);
                        }
                    } else if (qefVar instanceof qef.t) {
                        clipsUploadFragmentImpl.fo().d().c(clipsUploadFragmentImpl.requireContext(), ((qef.t) qefVar).a);
                    } else if (qefVar instanceof qef.d0) {
                        qef.d0 d0Var = (qef.d0) qefVar;
                        clipsUploadFragmentImpl.fo().d().a((int) clipsUploadFragmentImpl.getResources().getDimension(R.dimen.ord_snackbar_bottom_margin), clipsUploadFragmentImpl.requireContext(), d0Var.a, d0Var.b);
                    } else if (qefVar instanceof qef.w) {
                        qef.w wVar = (qef.w) qefVar;
                        bc6 L2 = xa4.L(clipsUploadFragmentImpl.kn());
                        imf l = clipsUploadFragmentImpl.fo().l();
                        UserId userId5 = wVar.b;
                        ClipAttachedVideoInfo clipAttachedVideoInfo = wVar.a;
                        L2.D(l.b(new ClipsVideoAttachmentData("", true, userId5, clipAttachedVideoInfo != null ? clipAttachedVideoInfo.d : "", clipAttachedVideoInfo != null ? clipAttachedVideoInfo.c : null, clipAttachedVideoInfo != null ? clipAttachedVideoInfo.b : null, clipAttachedVideoInfo != null ? clipAttachedVideoInfo.e : null), clipsUploadFragmentImpl.requireContext()), ActivityResultType.AttachVideo.ordinal(), null);
                    } else if (epx.f(qefVar, qef.x.a)) {
                        clipsUploadFragmentImpl.fo().k().kb(clipsUploadFragmentImpl.kn(), new px0(hjfVar, 22));
                    } else if (qefVar instanceof qef.k) {
                        UserId userId6 = ((qef.k) qefVar).a;
                        hjfVar.b(lbf.a.d.b);
                        if (fkq0.d(userId6)) {
                            rwi.d().c().g(clipsUploadFragmentImpl.requireContext(), (r3 & 16) != 0 ? null : "co_ownership", (r3 & 4) == 0);
                        } else {
                            ((cpu) clipsUploadFragmentImpl.fo().A.getValue()).s(clipsUploadFragmentImpl.requireContext(), fkq0.a(userId6), (r13 & 4) != 0 ? null : "open_page", (r13 & 8) != 0 ? null : "info", (r13 & 16) == 0 ? "co_owners" : null);
                        }
                    } else if (qefVar instanceof qef.e) {
                        pef pefVar = (pef) clipsUploadFragmentImpl.W.getValue();
                        myc0.h(pefVar.b, null, null, new oef(pefVar, ((qef.e) qefVar).a, null), 3);
                    } else if (qefVar instanceof qef.d) {
                        yud yudVar2 = (yud) clipsUploadFragmentImpl.X.getValue();
                        FragmentManager parentFragmentManager = clipsUploadFragmentImpl.getParentFragmentManager();
                        parentFragmentManager.l0("key_request_settings", yudVar2.d, new rj7(parentFragmentManager, hjfVar));
                        ((hwo) yudVar2.e.getValue()).a(yudVar2.a);
                    } else if (qefVar instanceof qef.a0) {
                        qef.a0 a0Var = (qef.a0) qefVar;
                        int i7 = e.$EnumSwitchMapping$1[a0Var.b.ordinal()];
                        if (i7 == 1) {
                            i = a0Var.a.i();
                        } else {
                            if (i7 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = a0Var.a.h();
                        }
                        clipsUploadFragmentImpl.fo().k().T3(clipsUploadFragmentImpl.kn(), clipsUploadFragmentImpl.getString(a0Var.a.j()), clipsUploadFragmentImpl.getString(i));
                    } else if (qefVar instanceof qef.m) {
                        maz.c(clipsUploadFragmentImpl.fo().b().p().e(), clipsUploadFragmentImpl.requireContext(), a0a.d.concat("/trending"), LaunchContext.A, null, null, 24);
                    } else if (qefVar instanceof qef.f0) {
                        qef.f0 f0Var = (qef.f0) qefVar;
                        clipsUploadFragmentImpl.fo().k().s5(clipsUploadFragmentImpl.kn(), f0Var.a, f0Var.b, new i(9, hjfVar, f0Var));
                    } else if (qefVar instanceof qef.b) {
                        xa4.L(clipsUploadFragmentImpl.kn()).D(clipsUploadFragmentImpl.fo().f().u4().a(clipsUploadFragmentImpl.requireContext(), new dj1(17)).a(((qef.b) qefVar).a), ActivityResultType.CoverSelector.ordinal(), null);
                    } else if (qefVar instanceof qef.c) {
                        kld kldVar = (kld) clipsUploadFragmentImpl.V.getValue();
                        Activity activity = kldVar.a;
                        if ((activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null) != null) {
                            xas0 xas0Var = (xas0) kldVar.c.getValue();
                            Parcelable.Creator<ChannelCreateScreenSourceArgs> creator = ChannelCreateScreenSourceArgs.CREATOR;
                            xas0Var.getClass();
                        }
                    } else {
                        if (!(qefVar instanceof qef.s)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((kld) clipsUploadFragmentImpl.V.getValue()).getClass();
                        hjfVar.b(new lbf.a.C3246a(((qef.s) qefVar).a, 2));
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipsUploadFragmentImpl.kt */
    @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$onCreateView$1$1$2$1", f = "ClipsUploadFragmentImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes17.dex */
    public static final class g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ hjf $uploadStore;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(hjf hjfVar, spj<? super g> spjVar) {
            super(2, spjVar);
            this.$uploadStore = hjfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return ClipsUploadFragmentImpl.this.new g(this.$uploadStore, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ClipsUploadFragmentImpl clipsUploadFragmentImpl = ClipsUploadFragmentImpl.this;
            String str = ClipsUploadFragmentImpl.a0;
            clipsUploadFragmentImpl.fo().d().d(new kf1(this.$uploadStore, 21));
            return s3q0.a;
        }
    }

    public ClipsUploadFragmentImpl() {
        y6 y6Var = new y6(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, y6Var);
        this.O = msy.a(lazyThreadSafetyMode, new pr1(9));
        this.P = new nbs(this.D);
        this.Q = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.presenter.b(this, 18));
        this.R = msy.a(lazyThreadSafetyMode, new qc(this, 21));
        this.S = msy.a(lazyThreadSafetyMode, new i5f(this, 2));
        this.T = msy.a(lazyThreadSafetyMode, new pff(this, 0));
        this.U = msy.a(lazyThreadSafetyMode, new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 28));
        this.V = msy.a(lazyThreadSafetyMode, new f1(this, 25));
        this.W = msy.a(lazyThreadSafetyMode, new ng1(this, 24));
        this.X = msy.a(lazyThreadSafetyMode, new yc(this, 28));
        this.Y = msy.a(lazyThreadSafetyMode, new rj1(this, 24));
        this.Z = k.b(new e0(15));
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        getOnBackPressedDispatcher().d();
        return getOnBackPressedDispatcher().b;
    }

    public final void eo(z37<lbf> z37Var, Object obj, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1335423810);
        if ((i & 6) == 0) {
            i2 = i | (M.J(z37Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(obj) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1335423810, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl.SdkActionsHandler (ClipsUploadFragmentImpl.kt:317)");
            }
            f5z f5zVar = (f5z) M.r(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            wh50 a2 = s4z.a(f5zVar.getLifecycle(), M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            T value = a2.getValue();
            boolean y = ((i2 & 112) == 32) | M.y(yvjVar) | M.y(f5zVar) | ((i2 & 14) == 4);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                aa5 aa5Var = new aa5(yvjVar, f5zVar, obj, z37Var, 2);
                M.R(aa5Var);
                x2 = aa5Var;
            }
            bap.c(value, (izs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new zq2(i, 2, this, z37Var, obj));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final iff fo() {
        return (iff) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment, xsna.f5z
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.r180
    public final p180 getOnBackPressedDispatcher() {
        return (p180) this.O.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ActivityResultType activityResultType = (ActivityResultType) j5g.b0(i, ActivityResultType.h());
        if (activityResultType != null) {
            ((izs) ((zak0) this.Z).getValue()).invoke(new eb0(activityResultType, i2, intent));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComponentCallbacks2 componentCallbacks2;
        fo().d().b();
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            bpn0 bpn0Var = enj.a;
            componentCallbacks2 = e3m.h(mo2getContext);
        } else {
            componentCallbacks2 = null;
        }
        aeg0 aeg0Var = componentCallbacks2 instanceof aeg0 ? (aeg0) componentCallbacks2 : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this);
        }
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(kai.b(-1412181729, new m2(this, fo().i().Pb(), new fgf())));
        return composeView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        fo().d().e();
        fo().h().dispose();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Object obj;
        super.onDestroyView();
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            bpn0 bpn0Var = enj.a;
            obj = e3m.h(mo2getContext);
        } else {
            obj = null;
        }
        aeg0 aeg0Var = obj instanceof aeg0 ? (aeg0) obj : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this);
        }
    }
}
