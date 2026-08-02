package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import java.util.Map;
import xsna.zcl;

/* compiled from: UniversalRequestStoreKt.kt */
/* loaded from: classes14.dex */
public final class UniversalRequestStoreKt {
    public static final UniversalRequestStoreKt INSTANCE = new UniversalRequestStoreKt();

    /* compiled from: UniversalRequestStoreKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalRequestStoreOuterClass.UniversalRequestStore.Builder _builder;

        /* compiled from: UniversalRequestStoreKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: UniversalRequestStoreKt.kt */
        public static final class UniversalRequestMapProxy extends DslProxy {
            private UniversalRequestMapProxy() {
            }
        }

        public /* synthetic */ Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestStoreOuterClass.UniversalRequestStore _build() {
            return this._builder.build();
        }

        public final /* synthetic */ void clearUniversalRequestMap(DslMap dslMap) {
            this._builder.clearUniversalRequestMap();
        }

        public final /* synthetic */ DslMap getUniversalRequestMapMap() {
            return new DslMap(this._builder.getUniversalRequestMapMap());
        }

        public final /* synthetic */ void putAllUniversalRequestMap(DslMap dslMap, Map map) {
            this._builder.putAllUniversalRequestMap(map);
        }

        /* renamed from: putUniversalRequestMap, reason: merged with bridge method [inline-methods] */
        public final void setUniversalRequestMap(DslMap<String, ByteString, UniversalRequestMapProxy> dslMap, String str, ByteString byteString) {
            this._builder.putUniversalRequestMap(str, byteString);
        }

        public final /* synthetic */ void removeUniversalRequestMap(DslMap dslMap, String str) {
            this._builder.removeUniversalRequestMap(str);
        }

        private Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
            this._builder = builder;
        }
    }

    private UniversalRequestStoreKt() {
    }
}
