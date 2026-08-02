package com.vk.voip.ui.menu.feature;

import android.util.Size;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerState;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.core.fragments.BaseFragment;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.common.Image;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.music.audiobook.AudioBookPersonRole;
import com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenFragment;
import com.vk.im.ui.components.chat_profile.ProfileLinkActionChooser;
import com.vk.log.L;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e;
import com.vk.permission.d;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.c;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vk.webapp.fragments.CommunityManageFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.WebViewFragment;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a0a;
import xsna.a89;
import xsna.ao8;
import xsna.azb;
import xsna.bi9;
import xsna.c5g;
import xsna.cvk;
import xsna.cwb0;
import xsna.d06;
import xsna.d5d;
import xsna.d920;
import xsna.e2e;
import xsna.epx;
import xsna.gg1;
import xsna.ghw0;
import xsna.gva;
import xsna.hxb;
import xsna.ihw0;
import xsna.ikv0;
import xsna.it80;
import xsna.izs;
import xsna.j5g;
import xsna.j9x;
import xsna.jhw0;
import xsna.kb7;
import xsna.le8;
import xsna.m99;
import xsna.mwa;
import xsna.myc0;
import xsna.np5;
import xsna.o6f;
import xsna.oa7;
import xsna.oyd;
import xsna.pg8;
import xsna.pi8;
import xsna.pla;
import xsna.q0e;
import xsna.q68;
import xsna.qcy;
import xsna.qd8;
import xsna.qg8;
import xsna.r3b;
import xsna.r8f;
import xsna.rm0;
import xsna.ruc;
import xsna.rwp;
import xsna.ry0;
import xsna.s0e;
import xsna.s3q0;
import xsna.s8f;
import xsna.shb;
import xsna.suc;
import xsna.swe0;
import xsna.szd;
import xsna.t3f;
import xsna.tj50;
import xsna.tlo0;
import xsna.tqe;
import xsna.u3f;
import xsna.us1;
import xsna.v1d;
import xsna.v59;
import xsna.w9b;
import xsna.w9y;
import xsna.wi8;
import xsna.wzd;
import xsna.xcw0;
import xsna.xyb;
import xsna.y7f;
import xsna.ya7;
import xsna.yds0;
import xsna.z7f;
import xsna.z8d;
import xsna.za7;
import xsna.zak0;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:330:0x0944, code lost:
    
        if (r5 == 0) goto L418;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, xsna.jhw0$d$c] */
    /* JADX WARN: Type inference failed for: r2v103, types: [xsna.jhw0$d] */
    /* JADX WARN: Type inference failed for: r3v75, types: [xsna.w9y] */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List<Fragment> f;
        int indexOf;
        ArrayList arrayList;
        zxd0 zxd0Var;
        List<yds0> videoDataList;
        int i = 2;
        boolean z = true;
        Size size = null;
        switch (this.b) {
            case 0:
                ihw0 ihw0Var = (ihw0) this.c;
                ghw0 ghw0Var = (ghw0) obj;
                jhw0 P0 = ihw0Var.b.P0();
                jhw0.f.c cVar = jhw0.f.c.a;
                ihw0.a aVar = ihw0Var.a;
                boolean z2 = ihw0Var.d;
                jhw0.d.b bVar = jhw0.d.b.a;
                ?? r10 = jhw0.d.c.a;
                jhw0.f.a aVar2 = jhw0.f.a.a;
                L.e("action -> " + ghw0Var + " for " + P0);
                if (ghw0Var instanceof ghw0.h) {
                    ghw0.h hVar = (ghw0.h) ghw0Var;
                    if (P0 instanceof jhw0.c) {
                        jhw0.c cVar2 = (jhw0.c) P0;
                        ihw0Var.c(new jhw0.e(cVar2.a, cVar2.b, cVar2.c, cVar2.d, cVar2.e, hVar.a));
                    }
                } else if (ghw0Var instanceof ghw0.a) {
                    ghw0.a aVar3 = (ghw0.a) ghw0Var;
                    if (P0 instanceof jhw0.e) {
                        jhw0.e eVar = (jhw0.e) P0;
                        boolean z3 = eVar.b;
                        if (z3 || !z2) {
                            ihw0Var.c(new jhw0.b(eVar.a, z3, eVar.c, eVar.d, new jhw0.a.c(aVar3.a), (pla.e().b().m(HintId.VOIP_CALL_FEATURE_ONBOARDING_MENU) || !((jhw0.e) P0).e.isEmpty()) ? r10 : bVar, eVar.e, eVar.f));
                        } else {
                            ihw0Var.c(new jhw0.c(eVar.a, false, eVar.c, aVar2, eVar.e, eVar.f));
                        }
                    }
                } else if (ghw0Var instanceof ghw0.k) {
                    ghw0.k kVar = (ghw0.k) ghw0Var;
                    jhw0.d.a aVar4 = jhw0.d.a.a;
                    if (P0 instanceof jhw0.b) {
                        if (kVar instanceof ghw0.k.c) {
                            jhw0.b bVar2 = (jhw0.b) P0;
                            ihw0Var.c(new jhw0.c(bVar2.a, bVar2.b, bVar2.c, bVar2.d, bVar2.g, ((ghw0.k.c) kVar).a));
                        } else {
                            jhw0.b bVar3 = (jhw0.b) P0;
                            if ((bVar3.e instanceof jhw0.a.e) && epx.f(bVar3.d, aVar2) && (kVar instanceof ghw0.k.a)) {
                                ihw0Var.c(jhw0.b.e(bVar3, false, false, null, null, aVar4, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE));
                            } else {
                                jhw0.a aVar5 = bVar3.e;
                                if (aVar5 instanceof jhw0.a.b) {
                                    ihw0Var.c(jhw0.b.e(bVar3, false, false, null, new jhw0.a.f(((jhw0.a.b) aVar5).a), kVar instanceof ghw0.k.b ? bVar3.f : aVar4, null, 207));
                                }
                            }
                        }
                    }
                } else if (ghw0Var instanceof ghw0.e) {
                    if (P0 instanceof jhw0.b) {
                        jhw0.b bVar4 = (jhw0.b) P0;
                        jhw0.a aVar6 = bVar4.e;
                        if (aVar6 instanceof jhw0.a.c) {
                            ihw0Var.c(jhw0.b.e(bVar4, false, false, null, new jhw0.a.b(((jhw0.a.c) aVar6).a), null, null, 239));
                        }
                    }
                } else if (ghw0Var instanceof ghw0.g) {
                    if (P0 instanceof jhw0.b) {
                        jhw0.b bVar5 = (jhw0.b) P0;
                        jhw0.a aVar7 = bVar5.e;
                        if (aVar7 instanceof jhw0.a.f) {
                            Fragment fragment = ((jhw0.a.f) aVar7).a;
                            ihw0Var.c(jhw0.b.e(bVar5, false, false, null, new jhw0.a.e(fragment, ((Boolean) aVar.g.invoke(fragment)).booleanValue()), null, null, 239));
                        }
                    }
                } else if (ghw0Var instanceof ghw0.f) {
                    ghw0.f fVar = (ghw0.f) ghw0Var;
                    if (P0 instanceof jhw0.c) {
                        z = false;
                    } else if (!(P0 instanceof jhw0.e)) {
                        if (!(P0 instanceof jhw0.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = epx.f(fVar.a, ((jhw0.b) P0).e.getContent());
                    }
                    if (z) {
                        ihw0Var.c(new jhw0.c(P0.d(), P0.isVisible(), P0.isEnabled(), aVar2, P0.a(), P0.b()));
                    }
                } else if (ghw0Var instanceof ghw0.n) {
                    ghw0.n nVar = (ghw0.n) ghw0Var;
                    if (P0 instanceof jhw0.b) {
                        jhw0.b bVar6 = (jhw0.b) P0;
                        if (epx.f(bVar6.f, r10)) {
                            nVar.getClass();
                            ihw0Var.c(jhw0.b.e(bVar6, false, false, null, null, new jhw0.d.C3121d(), null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE));
                        }
                    }
                } else if (!(ghw0Var instanceof ghw0.o)) {
                    if (ghw0Var instanceof ghw0.m) {
                        if (P0 instanceof jhw0.b) {
                            jhw0.b bVar7 = (jhw0.b) P0;
                            ihw0Var.e.onNext(new v59.c(bVar7.g));
                            ihw0Var.c(jhw0.b.e(bVar7, false, false, aVar2, null, bVar, EmptyList.b, 151));
                        }
                    } else if (ghw0Var instanceof ghw0.r) {
                        boolean booleanValue = ((Boolean) aVar.d.invoke(Boolean.valueOf(((ghw0.r) ghw0Var).a))).booleanValue();
                        boolean booleanValue2 = ((Boolean) aVar.e.invoke()).booleanValue();
                        if (P0.isVisible() != booleanValue || P0.isEnabled() != booleanValue2) {
                            if (P0 instanceof jhw0.c) {
                                ihw0Var.c(jhw0.c.e((jhw0.c) P0, booleanValue, booleanValue2, null, null, 57));
                            } else if (P0 instanceof jhw0.e) {
                                ihw0Var.c(jhw0.e.e((jhw0.e) P0, booleanValue, booleanValue2, null, null, 57));
                            } else {
                                if (!(P0 instanceof jhw0.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!z2 || booleanValue) {
                                    ihw0Var.c(jhw0.b.e((jhw0.b) P0, booleanValue, booleanValue2, null, null, null, null, 249));
                                } else {
                                    jhw0.b bVar8 = (jhw0.b) P0;
                                    ihw0Var.c(jhw0.b.e(bVar8, false, booleanValue2, null, new jhw0.a.C3120a(bVar8.e.getContent()), bVar, null, 201));
                                }
                            }
                        }
                    } else if (ghw0Var instanceof ghw0.s) {
                        if (epx.f(P0.c(), aVar2) && ((Boolean) aVar.f.invoke()).booleanValue()) {
                            ihw0Var.b(P0, jhw0.f.d.a);
                        } else if (P0.c() instanceof jhw0.f.b) {
                            ihw0Var.b(P0, cVar);
                        }
                    } else if (ghw0Var instanceof ghw0.c) {
                        if (P0.c() instanceof jhw0.f.b) {
                            ihw0Var.b(P0, cVar);
                        }
                    } else if (ghw0Var instanceof ghw0.j) {
                        if (!(P0.c() instanceof jhw0.f.b)) {
                            if (P0 instanceof jhw0.b) {
                                Fragment content = ((jhw0.b) P0).e.getContent();
                                FragmentManager fragmentManager = aVar.b;
                                if (fragmentManager != null && (f = fragmentManager.c.f()) != null && (indexOf = f.indexOf(content)) >= 0) {
                                    List<Fragment> subList = f.subList(indexOf, f.size());
                                    if (!(subList instanceof Collection) || !subList.isEmpty()) {
                                        for (Fragment fragment2 : subList) {
                                            if (!epx.f(fragment2, content) && !(fragment2 instanceof d)) {
                                                break;
                                            }
                                        }
                                    }
                                    r5 = 1;
                                    break;
                                }
                            }
                            ihw0Var.b(P0, new jhw0.f.b(true));
                        }
                    } else if (ghw0Var instanceof ghw0.d) {
                        jhw0.f c = P0.c();
                        if ((c instanceof jhw0.f.b) || (c instanceof jhw0.f.c)) {
                            ihw0Var.b(P0, aVar2);
                        }
                    } else if (ghw0Var instanceof ghw0.l) {
                        ghw0.l lVar = (ghw0.l) ghw0Var;
                        if (P0 instanceof jhw0.b) {
                            List singletonList = Collections.singletonList("asr_online_selector");
                            Fragment fragment3 = lVar.a;
                            if (!j5g.P(singletonList, fragment3.getTag())) {
                                jhw0.b bVar9 = (jhw0.b) P0;
                                jhw0.a aVar8 = bVar9.e;
                                if ((aVar8 instanceof jhw0.a.d) && ((jhw0.a.d) aVar8).b.equals(fragment3)) {
                                    ihw0Var.c(jhw0.b.e(bVar9, false, false, null, new jhw0.a.e(fragment3, ((Boolean) aVar.g.invoke(fragment3)).booleanValue()), null, null, 239));
                                } else if (!epx.f(bVar9.e.getContent(), fragment3)) {
                                    ihw0Var.c(jhw0.b.e(bVar9, false, false, aVar2, null, null, null, 247));
                                }
                            }
                        }
                    } else if (ghw0Var instanceof ghw0.b) {
                        if (P0 instanceof jhw0.c) {
                            ihw0Var.c(jhw0.c.e((jhw0.c) P0, false, false, null, null, 62));
                        } else if (P0 instanceof jhw0.e) {
                            ihw0Var.c(jhw0.e.e((jhw0.e) P0, false, false, null, null, 62));
                        } else {
                            if (!(P0 instanceof jhw0.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ihw0Var.c(jhw0.b.e((jhw0.b) P0, false, false, null, null, null, null, 254));
                        }
                    } else if (ghw0Var instanceof ghw0.p) {
                        ghw0.p pVar = (ghw0.p) ghw0Var;
                        if (P0 instanceof jhw0.b) {
                            jhw0.b bVar10 = (jhw0.b) P0;
                            jhw0.a aVar9 = bVar10.e;
                            if (aVar9 instanceof jhw0.a.e) {
                                ihw0Var.c(jhw0.b.e(bVar10, false, false, null, new jhw0.a.d(((jhw0.a.e) aVar9).a, pVar.a, pVar.b), null, null, 239));
                            }
                        }
                    } else if (ghw0Var instanceof ghw0.i) {
                        ihw0Var.c(new jhw0.c(P0.d(), P0.isVisible(), P0.isEnabled(), aVar2, P0.a(), P0.b()));
                    } else {
                        if (!(ghw0Var instanceof ghw0.q)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ghw0.q qVar = (ghw0.q) ghw0Var;
                        if (P0 instanceof jhw0.c) {
                            jhw0.c cVar3 = (jhw0.c) P0;
                            ArrayList arrayList2 = qVar.a;
                            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((FeatureId) it.next()).h());
                            }
                            ihw0Var.c(jhw0.c.e(cVar3, false, false, null, arrayList3, 47));
                        } else if (P0 instanceof jhw0.e) {
                            jhw0.e eVar2 = (jhw0.e) P0;
                            ArrayList arrayList4 = qVar.a;
                            ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                            Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(((FeatureId) it2.next()).h());
                            }
                            ihw0Var.c(jhw0.e.e(eVar2, false, false, null, arrayList5, 47));
                        } else {
                            if (!(P0 instanceof jhw0.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jhw0.b bVar11 = (jhw0.b) P0;
                            ArrayList arrayList6 = qVar.a;
                            ArrayList arrayList7 = new ArrayList(c5g.u(arrayList6, 10));
                            Iterator it3 = arrayList6.iterator();
                            while (it3.hasNext()) {
                                arrayList7.add(((FeatureId) it3.next()).h());
                            }
                            jhw0.d dVar = bVar11.f;
                            ihw0Var.c(jhw0.b.e(bVar11, false, false, null, null, dVar instanceof jhw0.d.b ? r10 : dVar, arrayList7, 159));
                        }
                    }
                }
                return s3q0.a;
            case 1:
                gg1 gg1Var = (gg1) this.c;
                String b = gg1Var.g.b((Throwable) obj);
                tlo0.Companion.getClass();
                gg1Var.Z(null, null, new tlo0.h(b));
                return s3q0.a;
            case 2:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) this.c;
                int intValue = ((Integer) obj).intValue();
                c cVar4 = albumDetailsFragment.m0;
                if (cVar4 == null) {
                    cVar4 = null;
                }
                d920 d920Var = cVar4.u;
                j9x it4 = swe0.q(0, d920Var.B0(cVar4.q)).iterator();
                while (it4.d) {
                    r5 += d920Var.c.get(it4.nextInt()).getItemCount();
                }
                RecyclerView.e0 findViewHolderForAdapterPosition = cVar4.g.getRecyclerView().findViewHolderForAdapterPosition(intValue + r5);
                if (findViewHolderForAdapterPosition != null) {
                    return findViewHolderForAdapterPosition.itemView;
                }
                return null;
            case 3:
                us1 us1Var = (us1) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) us1Var.c).setValue(bool);
                return s3q0.a;
            case 4:
                AudioBookPerson audioBookPerson = (AudioBookPerson) this.c;
                ?? r3 = (w9y) obj;
                r3.c(Integer.valueOf(audioBookPerson.b), "id");
                r3.e(audioBookPerson.c, "name");
                r3.e(audioBookPerson.d, "description");
                Image image = audioBookPerson.e;
                r3.e(image != null ? image.Gb() : null, "photo");
                List<AudioBookPersonRole> list = audioBookPerson.f;
                if (list != null) {
                    List<AudioBookPersonRole> list2 = list;
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(((AudioBookPersonRole) it5.next()).i());
                    }
                } else {
                    arrayList = null;
                }
                r3.e(arrayList, SignalingProtocol.KEY_ROLES);
                r3.c(Integer.valueOf(audioBookPerson.g), "flags_context");
                return s3q0.a;
            case 5:
                BaseFragment baseFragment = (BaseFragment) this.c;
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.h0()) {
                        String string = vKApiExecutionException.w().getString("validation_url", String.format("https://m.%s/payments?act=buy_votes", Arrays.copyOf(new Object[]{a0a.d}, 1)));
                        String string2 = baseFragment.getString(R.string.votes_fill_balance);
                        WebViewFragment.c cVar5 = new WebViewFragment.c(string);
                        cVar5.H(string2);
                        cVar5.F(false, false);
                        cVar5.A();
                        cVar5.j.putBoolean("force_portrait_orientation", true);
                        cVar5.g(228, baseFragment);
                        return s3q0.a;
                    }
                }
                cvk.w(th.getLocalizedMessage(), false);
                return s3q0.a;
            case 6:
                return new kb7.b(((tj50.a) obj).a(new ya7(1, ((za7) this.c).d, oa7.class, "toViewState", "toViewState(Lcom/vk/friends/impl/birthdays/domain/BirthdaysListState$Content;)Lcom/vk/friends/impl/birthdays/presentation/BirthdaysListViewState$BirthdaysList;", 0), ao8.d));
            case 7:
                BookingEditScreenFragment bookingEditScreenFragment = (BookingEditScreenFragment) this.c;
                qcy<Object>[] qcyVarArr = BookingEditScreenFragment.W;
                bookingEditScreenFragment.S = rwp.a(bookingEditScreenFragment.requireContext(), (Exception) obj, false);
                return s3q0.a;
            case 8:
                q68 q68Var = (q68) this.c;
                View view = (View) obj;
                e.a.AbstractC1393a abstractC1393a = q68Var.q;
                if (abstractC1393a != null) {
                    view.performHapticFeedback(3);
                    q68Var.m.invoke(abstractC1393a);
                }
                return s3q0.a;
            case 9:
                BroadcastConfigFragment broadcastConfigFragment = (BroadcastConfigFragment) this.c;
                le8 le8Var = (le8) obj;
                int i2 = BroadcastConfigFragment.U;
                broadcastConfigFragment.R.getClass();
                return new it80(le8Var instanceof le8.e ? new qd8.d(((le8.e) le8Var).a) : le8Var instanceof le8.a ? new qd8.a(((le8.a) le8Var).a) : le8Var instanceof le8.c ? new qd8.c(((le8.c) le8Var).a) : le8Var instanceof le8.b ? new qd8.b(((le8.b) le8Var).a) : null);
            case 10:
                pg8 pg8Var = (pg8) this.c;
                qg8.c cVar6 = qg8.c.a;
                if (pg8Var.m) {
                    pg8Var.l.onNext(cVar6);
                }
                return s3q0.a;
            case 11:
                pi8 pi8Var = (pi8) this.c;
                Throwable th2 = (Throwable) obj;
                pi8Var.h.a(th2);
                pi8Var.T(new wi8.b(th2));
                return s3q0.a;
            case 12:
                ((a89) this.c).q(xcw0.t.a);
                return s3q0.a;
            case 13:
                ((m99) this.c).p();
                return s3q0.a;
            case 14:
                bi9 bi9Var = (bi9) this.c;
                bi9Var.d = false;
                bi9Var.c(null, (Throwable) obj);
                bi9Var.a.Q();
                return s3q0.a;
            case 15:
                return new Pair(Integer.valueOf(((gva.a) this.c).a), (mwa.a) obj);
            case 16:
                Collection collection = (Collection) obj;
                com.vk.im.engine.internal.storage.delegates.channel_messages.a aVar10 = ((r3b) this.c).c;
                aVar10.getClass();
                if (!collection.isEmpty()) {
                    aVar10.b.b().h(new rm0(1 == true ? 1 : 0, aVar10, collection));
                }
                return s3q0.a;
            case 17:
                w9b w9bVar = (w9b) this.c;
                int i3 = w9b.a.$EnumSwitchMapping$3[((ProfileLinkActionChooser.LinkAction) obj).ordinal()];
                if (i3 == 1) {
                    zxd0Var = zxd0.s.a.a;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zxd0Var = zxd0.s.b.a;
                }
                w9bVar.s(zxd0Var);
                return s3q0.a;
            case 18:
                ((View) ((shb) this.c).a).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return s3q0.a;
            case 19:
                ((hxb) this.c).I0((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 20:
                azb azbVar = ((xyb) this.c).A;
                if (azbVar != null) {
                    azbVar.a().c(new cwb0.p(null), new ry0(azbVar, 14));
                }
                return s3q0.a;
            case 21:
                ((com.vk.clips.sdk.shared.item.clip.a) this.c).T((ClipItemPatch) obj);
                return s3q0.a;
            case 22:
                ((v1d) this.c).a.a(new d5d(((Integer) obj).intValue()));
                return s3q0.a;
            case 23:
                return (Long) this.c;
            case 24:
                oyd oydVar = (oyd) this.c;
                ClipsEditorMusicInfo clipsEditorMusicInfo = (ClipsEditorMusicInfo) obj;
                szd szdVar = oydVar.b;
                int e = (int) szdVar.o.a.e();
                e2e e2eVar = oydVar.a;
                int a = e2eVar.k.a(clipsEditorMusicInfo.j);
                ClipsEditorMusicTrack clipsEditorMusicTrack = clipsEditorMusicInfo.b;
                int i4 = clipsEditorMusicTrack.e;
                int i5 = clipsEditorMusicInfo.h;
                int min = Math.min(e, Math.min(a, i4 - i5));
                int i6 = clipsEditorMusicInfo.h;
                ClipsEditorMusicInfo zb = ClipsEditorMusicInfo.zb(clipsEditorMusicInfo, null, null, i6, i6 + min, 0, null, 0, 2019);
                com.vk.clips.editor.state.model.a b2 = szdVar.b();
                List<? extends wzd> singletonList2 = Collections.singletonList(new wzd.a((b2 != null ? b2.d : null) == null ? ruc.a : suc.a, (int) (1 == true ? 1 : 0)));
                int min2 = Math.min(e2eVar.k.a(clipsEditorMusicInfo.j), clipsEditorMusicTrack.e - i5);
                ClipsEditorAudioItem clipsEditorAudioItem = szdVar.o.a.d;
                ClipsEditorAudioItem clipsEditorAudioItem2 = clipsEditorAudioItem == null ? new ClipsEditorAudioItem(zb, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, 14) : clipsEditorAudioItem != null ? ClipsEditorAudioItem.a(clipsEditorAudioItem, zb, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 14) : null;
                ClipsEditorAudioItem clipsEditorAudioItem3 = clipsEditorAudioItem2;
                szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, null, clipsEditorAudioItem2, null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), singletonList2);
                if (clipsEditorAudioItem3 != null && min2 > szdVar.o.a.e()) {
                    q0e.b bVar12 = oydVar.c;
                    String str = clipsEditorAudioItem3.f;
                    q0e q0eVar = q0e.this;
                    q0eVar.P(q0e.c.a.a, false, true);
                    q0eVar.O().j(str);
                    s0e s0eVar = q0eVar.l;
                    (s0eVar == null ? null : s0eVar).m(str);
                }
                return s3q0.a;
            case 25:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) this.c;
                int i7 = ClipsFavoriteFolderContentListFragment.W;
                clipsFavoriteFolderContentListFragment.go(new np5(i, (ClipsFavoriteFolderContentListViewState.g) obj, clipsFavoriteFolderContentListFragment));
                return s3q0.a;
            case 26:
                ((com.vk.clips.playlists.ui.picker.d) this.c).f.getClass();
                return tqe.a((ClipsPlaylistPickerState.a) obj);
            case 27:
                ((u3f.b) this.c).getClass();
                return x.i((Throwable) obj);
            case 28:
                o6f o6fVar = (o6f) this.c;
                Pair pair = (Pair) obj;
                z7f z7fVar = (z7f) pair.i();
                List list3 = (List) pair.j();
                y7f.e eVar3 = o6fVar.c;
                z8d z8dVar = o6fVar.e;
                eVar3.e(z7fVar);
                r8f c2 = eVar3.c();
                long j = 0;
                if (c2 != null) {
                    ((s8f) c2).q(0L, list3);
                }
                if (c2 != null) {
                    ((s8f) c2).d(z7fVar.c());
                }
                Integer num = z7fVar.f;
                if (num != null) {
                    int intValue2 = num.intValue();
                    r8f b3 = z8dVar.a.b();
                    if (b3 != null && (videoDataList = ((s8f) b3).a.getVideoDataList()) != null && intValue2 < videoDataList.size()) {
                        Iterator it6 = j5g.H0(videoDataList, intValue2).iterator();
                        while (it6.hasNext()) {
                            j += ((yds0) it6.next()).b();
                        }
                        z8dVar.h(j + 1);
                    }
                } else {
                    z8dVar.h(0L);
                }
                z8dVar.d(true);
                o6fVar.h.j7();
                eVar3.a();
                return s3q0.a;
            default:
                CommunityManageFragment communityManageFragment = (CommunityManageFragment) this.c;
                JSONObject jSONObject = (JSONObject) obj;
                int i8 = CommunityManageFragment.i0;
                if (jSONObject != null) {
                    communityManageFragment.e0 = jSONObject.optString("state");
                    JSONObject optJSONObject = jSONObject.optJSONObject("message");
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("title");
                        String optString2 = optJSONObject.optString(X3.a.t);
                        if (myc0.f(optString) && myc0.f(optString2)) {
                            Pair pair2 = epx.f(optString2, "destructive") ? new Pair(Integer.valueOf(R.drawable.vk_icon_error_circle_outline_24), Integer.valueOf(R.attr.vk_ui_background_negative)) : new Pair(Integer.valueOf(R.drawable.vk_icon_check_circle_outline_24), Integer.valueOf(R.attr.vk_ui_icon_positive));
                            ikv0.a aVar11 = new ikv0.a(communityManageFragment.requireContext());
                            aVar11.t = new ikv0.c.C3058c(((Number) pair2.i()).intValue(), (Integer) pair2.j(), size, 12);
                            aVar11.u = new ikv0.d(optString, (String) (0 == true ? 1 : 0), (ikv0.d.a) (0 == true ? 1 : 0), 6);
                            aVar11.n();
                        }
                    }
                }
                return jSONObject;
        }
    }

    public /* synthetic */ a(d06 d06Var, BaseFragment baseFragment) {
        this.b = 5;
        this.c = baseFragment;
    }

    public /* synthetic */ a(u3f.b bVar, t3f t3fVar) {
        this.b = 27;
        this.c = bVar;
    }
}
