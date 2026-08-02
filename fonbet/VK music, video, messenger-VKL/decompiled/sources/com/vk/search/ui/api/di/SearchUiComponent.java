package com.vk.search.ui.api.di;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.search.integration.api.SearchTab;
import com.vk.search.params.api.VkGroupsSearchParams;
import xsna.brh0;
import xsna.bzh0;
import xsna.crh0;
import xsna.irh0;
import xsna.kwh0;
import xsna.pwj0;
import xsna.vu5;
import xsna.zzh0;

/* compiled from: SearchUiComponent.kt */
/* loaded from: classes5.dex */
public interface SearchUiComponent extends DiScopedComponent<pwj0> {
    public static final a Companion = a.a;

    /* compiled from: SearchUiComponent.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        /* compiled from: SearchUiComponent.kt */
        /* renamed from: com.vk.search.ui.api.di.SearchUiComponent$a$a, reason: collision with other inner class name */
        public interface InterfaceC1776a {

            /* compiled from: SearchUiComponent.kt */
            /* renamed from: com.vk.search.ui.api.di.SearchUiComponent$a$a$a, reason: collision with other inner class name */
            public static final class C1777a implements InterfaceC1776a {
                public final long a;
                public final SearchTab b;

                public C1777a(long j, SearchTab searchTab) {
                    this.a = j;
                    this.b = searchTab;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1777a)) {
                        return false;
                    }
                    C1777a c1777a = (C1777a) obj;
                    return this.a == c1777a.a && this.b == c1777a.b;
                }

                public final int hashCode() {
                    return this.b.hashCode() + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return "SearchInCommunity(communityId=" + this.a + ", startTab=" + this.b + ')';
                }
            }

            /* compiled from: SearchUiComponent.kt */
            /* renamed from: com.vk.search.ui.api.di.SearchUiComponent$a$a$b */
            public static final class b implements InterfaceC1776a {
                public final long a;

                public b(long j) {
                    this.a = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && this.a == ((b) obj).a;
                }

                public final int hashCode() {
                    return Long.hashCode(this.a);
                }

                public final String toString() {
                    return vu5.a(')', this.a, new StringBuilder("SearchOwnerVideos(ownerId="));
                }
            }
        }
    }

    void G9(Context context, a.InterfaceC1776a interfaceC1776a);

    bzh0 Ga();

    brh0 Td();

    crh0 W(irh0 irh0Var);

    crh0 h5(irh0 irh0Var, VkGroupsSearchParams vkGroupsSearchParams);

    kwh0 lf();

    zzh0 o9();
}
