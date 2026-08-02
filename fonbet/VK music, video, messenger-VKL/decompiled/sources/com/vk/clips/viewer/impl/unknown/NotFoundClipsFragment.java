package com.vk.clips.viewer.impl.unknown;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vkontakte.android.R;
import xsna.anj;
import xsna.asp;
import xsna.dhr0;
import xsna.e3m;
import xsna.eu;
import xsna.g620;
import xsna.jjc;
import xsna.lpj;
import xsna.m33;
import xsna.nds;
import xsna.oz50;
import xsna.px30;
import xsna.tds;
import xsna.uds;
import xsna.z720;
import xsna.zrp;

/* compiled from: NotFoundClipsFragment.kt */
/* loaded from: classes17.dex */
public final class NotFoundClipsFragment extends FragmentImpl implements uds, tds, nds {
    public static final /* synthetic */ int N = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotFoundClipsFragment.kt */
    public static final class Type implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type COMPILATION;
        public static final Parcelable.Creator<Type> CREATOR;
        public static final b Companion;
        public static final Type HASHTAG;
        public static final Type MASK;
        public static final Type MUSIC;
        public static final Type PROFILE;
        public static final Type UNKNOWN;

        /* compiled from: NotFoundClipsFragment.kt */
        public static final class a implements Parcelable.Creator<Type> {
            @Override // android.os.Parcelable.Creator
            public final Type createFromParcel(Parcel parcel) {
                return Type.values()[parcel.readInt()];
            }

            @Override // android.os.Parcelable.Creator
            public final Type[] newArray(int i) {
                return new Type[i];
            }
        }

        /* compiled from: NotFoundClipsFragment.kt */
        public static final class b {
        }

        static {
            Type type = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = type;
            Type type2 = new Type("PROFILE", 1);
            PROFILE = type2;
            Type type3 = new Type("MUSIC", 2);
            MUSIC = type3;
            Type type4 = new Type("HASHTAG", 3);
            HASHTAG = type4;
            Type type5 = new Type("MASK", 4);
            MASK = type5;
            Type type6 = new Type("COMPILATION", 5);
            COMPILATION = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new b();
            CREATOR = new a();
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* compiled from: NotFoundClipsFragment.kt */
    public static final class a extends oz50 {
        public a(Type type) {
            super(NotFoundClipsFragment.class, null, null);
            this.j.putParcelable("NotFoundClips.params", type);
        }
    }

    @Override // xsna.tds
    public final ColorStateList Oc() {
        return anj.b(R.color.color_list_bottom_menu_icons, requireContext());
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    @Override // xsna.tds
    public final z720.a gf() {
        return new z720.a(R.color.vk_black, R.color.color_list_left_menu_text, R.color.color_list_left_menu_icons, R.color.vk_black, R.color.vk_black, R.color.vk_white, R.color.vk_white);
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return requireContext().getColor(R.color.vk_black);
    }

    @Override // xsna.woo0
    public final int o7() {
        return requireContext().getColor(R.color.vk_black);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        eu supportActionBar;
        Context requireContext = requireContext();
        dhr0.a.getClass();
        lpj lpjVar = new lpj(requireContext, dhr0.u().c);
        View inflate = LayoutInflater.from(lpjVar).inflate(R.layout.fragment_not_found_clips, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.not_found_clips_toolbar);
        toolbar.setTitle("");
        FragmentActivity activity = getActivity();
        Drawable drawable = null;
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            appCompatActivity.setSupportActionBar(toolbar);
        }
        if (appCompatActivity != null) {
            e3m.a aVar = e3m.a;
            Drawable a2 = m33.a(R.drawable.vk_icon_arrow_left_outline_28, appCompatActivity);
            if (a2 != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    a2.setColorFilter(new BlendModeColorFilter(e3m.f(R.attr.vk_ui_icon_accent_themed, lpjVar), BlendMode.SRC_IN));
                } else {
                    a2.setColorFilter(e3m.f(R.attr.vk_ui_icon_accent_themed, lpjVar), PorterDuff.Mode.SRC_IN);
                }
                drawable = a2;
            }
        }
        if (appCompatActivity != null && (supportActionBar = appCompatActivity.getSupportActionBar()) != null) {
            supportActionBar.n(true);
            supportActionBar.r(drawable);
        }
        View findViewById = inflate.findViewById(R.id.not_found_clips_go_to_clips_feed);
        int i = 8;
        findViewById.setVisibility(g620.f().getExperiments().k() ? 0 : 8);
        jjc.g(findViewById, new px30(this, i));
        return inflate;
    }

    @Override // xsna.tds
    public final int qc() {
        return requireContext().getColor(R.color.vk_black);
    }
}
