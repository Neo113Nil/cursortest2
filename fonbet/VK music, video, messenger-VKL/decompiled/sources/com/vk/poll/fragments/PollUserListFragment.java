package com.vk.poll.fragments;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.polls.dto.PollsFieldsVotersDto;
import com.vk.api.generated.polls.dto.PollsGetVotersAgeDto;
import com.vk.api.generated.polls.dto.PollsGetVotersSexDto;
import com.vk.api.generated.polls.dto.PollsVotersFieldsUsersDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PollFilterParams;
import com.vk.dto.user.Platform;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.VisibleStatus;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.base.GridFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.atv0;
import xsna.azt;
import xsna.bpn0;
import xsna.bwt0;
import xsna.bxq;
import xsna.c5g;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.f4m;
import xsna.g2u0;
import xsna.hx2;
import xsna.iah0;
import xsna.j2r0;
import xsna.j5g;
import xsna.jb;
import xsna.jt9;
import xsna.jub0;
import xsna.jx2;
import xsna.m33;
import xsna.oq;
import xsna.oz50;
import xsna.tlo0;
import xsna.vif0;
import xsna.y84;
import xsna.yfb;

/* compiled from: PollUserListFragment.kt */
/* loaded from: classes17.dex */
public final class PollUserListFragment extends GridFragment<UserProfile> {
    public static final /* synthetic */ int U0 = 0;
    public int L0;
    public long M0;
    public UserId N0;
    public boolean O0;
    public PollFilterParams P0;
    public e Q0;
    public final bpn0 R0;
    public final bpn0 S0;
    public final b T0;

    /* compiled from: PollUserListFragment.kt */
    public static final class a implements VkCell.d {
        public final FrameLayout a;

        public a(Context context) {
            FrameLayout frameLayout = new FrameLayout(context);
            VKImageView vKImageView = new VKImageView(context, null, 6, 0);
            vKImageView.setRound(true);
            vKImageView.setPlaceholderImage(dhr0.w(R.drawable.user_placeholder, context));
            float f = 40;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f));
            layoutParams.gravity = 17;
            vKImageView.setLayoutParams(layoutParams);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            bwt0.p0(imageView, false);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 8388693;
            imageView.setTranslationY(cn70.c(4));
            imageView.setLayoutParams(layoutParams2);
            frameLayout.addView(vKImageView);
            frameLayout.addView(imageView);
            this.a = frameLayout;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                Drawable drawable = cVar.b;
                FrameLayout frameLayout = this.a;
                VKImageView vKImageView = (VKImageView) frameLayout.getChildAt(0);
                ImageView imageView = (ImageView) frameLayout.getChildAt(1);
                vKImageView.load(cVar.a);
                bwt0.p0(imageView, drawable != null);
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: PollUserListFragment.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: PollUserListFragment.kt */
    public static final class c implements VkCell.f {
        public final String a;
        public final Drawable b;

        public c(Drawable drawable, String str) {
            this.a = str;
            this.b = drawable;
        }
    }

    /* compiled from: PollUserListFragment.kt */
    public static final class d extends oz50 {
    }

    /* compiled from: PollUserListFragment.kt */
    public interface e {
        void T9(int i, boolean z);
    }

    /* compiled from: PollUserListFragment.kt */
    public final class f extends vif0<UserProfile> {
        public final VkCell n;

        public f(VkCell vkCell) {
            super(vkCell);
            this.n = vkCell;
        }

        @Override // xsna.vif0
        public final void i6(UserProfile userProfile) {
            Drawable a;
            UserProfile userProfile2 = userProfile;
            azt aztVar = new azt(17);
            VkCell vkCell = this.n;
            g2u0.d(vkCell, aztVar);
            PollUserListFragment pollUserListFragment = PollUserListFragment.this;
            vkCell.setLeftMainAvatarController(pollUserListFragment.T0);
            VkCell.Left.a aVar = VkCell.Left.Companion;
            String str = userProfile2.h;
            VisibleStatus zb = userProfile2.n.zb();
            if (zb != null && !zb.Ab()) {
                Platform platform = zb.e;
                if (platform == Platform.WEB) {
                    Context context = this.itemView.getContext();
                    e3m.a aVar2 = e3m.a;
                    a = m33.a(R.drawable.ic_online_web_composite_16, context);
                } else if (platform == Platform.MOBILE) {
                    Context context2 = this.itemView.getContext();
                    e3m.a aVar3 = e3m.a;
                    a = m33.a(R.drawable.ic_online_mobile_vkapp_composite_16, context2);
                }
                vkCell.setLeft(VkCell.Left.a.a(aVar, new VkCell.Left.Main.a(new c(a, str), VkCell.Left.Main.Size.Small)));
                vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, userProfile2.e), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
                vkCell.setOnClickListener(new bxq(2, pollUserListFragment, userProfile2));
            }
            a = null;
            vkCell.setLeft(VkCell.Left.a.a(aVar, new VkCell.Left.Main.a(new c(a, str), VkCell.Left.Main.Size.Small)));
            vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, userProfile2.e), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
            vkCell.setOnClickListener(new bxq(2, pollUserListFragment, userProfile2));
        }
    }

    /* compiled from: PollUserListFragment.kt */
    public final class g extends GridFragment<UserProfile>.b<vif0<UserProfile>> {
        public g() {
            super();
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final String B(int i, int i2) {
            int i3 = PollUserListFragment.U0;
            return ((UserProfile) PollUserListFragment.this.v0.get(i)).h;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final int G(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            int i2 = PollUserListFragment.U0;
            return ((UserProfile) PollUserListFragment.this.v0.get(i)).c.b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return PollUserListFragment.this.new f(new VkCell(viewGroup.getContext(), null, 6, 0));
        }
    }

    /* compiled from: PollUserListFragment.kt */
    public static final class h implements hx2<List<? extends PollsFieldsVotersDto>> {
        public h() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
        @Override // xsna.hx2
        public final void b(List<? extends PollsFieldsVotersDto> list) {
            ?? r2;
            List<UsersUserFullDto> e;
            Integer d;
            PollsFieldsVotersDto pollsFieldsVotersDto = (PollsFieldsVotersDto) j5g.a0(list);
            PollsVotersFieldsUsersDto d2 = pollsFieldsVotersDto != null ? pollsFieldsVotersDto.d() : null;
            int intValue = (d2 == null || (d = d2.d()) == null) ? 0 : d.intValue();
            PollUserListFragment pollUserListFragment = PollUserListFragment.this;
            if (d2 == null || (e = d2.e()) == null) {
                r2 = EmptyList.b;
            } else {
                List<UsersUserFullDto> list2 = e;
                r2 = new ArrayList(c5g.u(list2, 10));
                for (UsersUserFullDto usersUserFullDto : list2) {
                    ((j2r0) pollUserListFragment.S0.getValue()).getClass();
                    r2.add(j2r0.a(usersUserFullDto));
                }
            }
            VKList vKList = new VKList((Collection) r2);
            vKList.o(intValue);
            pollUserListFragment.zo(vKList);
            e eVar = pollUserListFragment.Q0;
            if (eVar != null) {
                eVar.T9(intValue, pollUserListFragment.O0);
            }
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            PollUserListFragment.this.onError(vKApiExecutionException);
        }
    }

    public PollUserListFragment() {
        super(50);
        this.N0 = UserId.d;
        this.R0 = new bpn0(new y84(18));
        this.S0 = new bpn0(new jb(29));
        this.T0 = new b();
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final GridFragment<UserProfile>.b<?> Io() {
        return new g();
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final int Ko() {
        int width;
        int i;
        UsableRecyclerView usableRecyclerView = this.n0;
        if (usableRecyclerView == null || (width = usableRecyclerView.getWidth()) <= 0) {
            return 1;
        }
        int paddingRight = width - (this.n0.getPaddingRight() + this.n0.getPaddingLeft());
        if (this.V >= 600) {
            i = iah0.a(this.U ? 160 : atv0.b);
        } else {
            i = paddingRight;
        }
        return paddingRight / i;
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final jt9 Lo() {
        return null;
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("no_autoload")) {
            if (this.f0) {
                oo();
            } else {
                qo();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (getParentFragment() instanceof e) {
            this.Q0 = (e) getParentFragment();
        }
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("title")) {
            return;
        }
        setTitle(arguments.getString("title"));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.L0 = arguments.getInt("poll_id");
            this.M0 = arguments.getLong("answer_id");
            UserId userId = (UserId) arguments.getParcelable("owner_ud");
            if (userId == null) {
                userId = UserId.d;
            }
            this.N0 = userId;
            this.O0 = arguments.getBoolean("friends_only");
            this.P0 = (PollFilterParams) arguments.getParcelable("filter");
        }
        this.m0 = 30;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.Q0 = null;
        super.onDetach();
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ho().setVisibility(8);
        f4m.j(view.findViewById(R.id.shadow));
        this.n0.setPadding(0, 0, 0, 0);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        PollsGetVotersSexDto pollsGetVotersSexDto;
        PollsGetVotersAgeDto pollsGetVotersAgeDto;
        int i3;
        int i4;
        int i5;
        PollFilterParams pollFilterParams = this.P0;
        Integer num = null;
        if (pollFilterParams == null || (i5 = pollFilterParams.d) == 0) {
            pollsGetVotersSexDto = null;
        } else {
            pollsGetVotersSexDto = i5 == 1 ? PollsGetVotersSexDto.TYPE_1 : PollsGetVotersSexDto.TYPE_2;
        }
        if (pollFilterParams == null || (i4 = pollFilterParams.e) == 0) {
            pollsGetVotersAgeDto = null;
        } else {
            pollsGetVotersAgeDto = i4 == 2 ? PollsGetVotersAgeDto.TYPE_2 : PollsGetVotersAgeDto.TYPE_3;
        }
        if (pollFilterParams != null && (i3 = pollFilterParams.b) != 0) {
            num = Integer.valueOf(i3);
        }
        this.i0 = new jx2(yfb.x(((jub0) this.R0.getValue()).b(this.L0, Collections.singletonList(Long.valueOf(this.M0)), this.N0, Boolean.valueOf(this.O0), Integer.valueOf(i), Integer.valueOf(i2), e43.l(UsersFieldsDto.ONLINE_INFO, UsersFieldsDto.PHOTO_BASE), pollsGetVotersAgeDto, pollsGetVotersSexDto, num)), new h()).a();
    }
}
