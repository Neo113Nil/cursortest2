package com.reactnativecommunity.asyncstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.twilio.voice.EventKeys;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import lc.AbstractC5447a;
import lc.AbstractC5448b;
import lc.AbstractC5454h;
import lc.C5457k;
import lc.ExecutorC5458l;

@ReactModule(name = "RNCAsyncStorage")
/* loaded from: classes4.dex */
public final class AsyncStorageModule extends NativeAsyncStorageModuleSpec {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNCAsyncStorage";
    private final ExecutorC5458l executor;
    private C5457k mReactDatabaseSupplier;
    private boolean mShuttingDown;

    public class a extends GuardedAsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f41262a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f41263b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f41262a = callback;
            this.f41263b = readableArray;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f41262a.invoke(AbstractC5448b.a(null), null);
                return;
            }
            String[] strArr = {"key", EventKeys.VALUE_KEY};
            HashSet hashSet = new HashSet();
            WritableArray createArray = Arguments.createArray();
            for (int i10 = 0; i10 < this.f41263b.size(); i10 += 999) {
                int min = Math.min(this.f41263b.size() - i10, 999);
                Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.J().query("catalystLocalStorage", strArr, AbstractC5447a.a(min), AbstractC5447a.b(this.f41263b, i10, min), null, null, null);
                hashSet.clear();
                try {
                    try {
                        if (query.getCount() != this.f41263b.size()) {
                            for (int i11 = i10; i11 < i10 + min; i11++) {
                                hashSet.add(this.f41263b.getString(i11));
                            }
                        }
                        if (query.moveToFirst()) {
                            do {
                                WritableArray createArray2 = Arguments.createArray();
                                createArray2.pushString(query.getString(0));
                                createArray2.pushString(query.getString(1));
                                createArray.pushArray(createArray2);
                                hashSet.remove(query.getString(0));
                            } while (query.moveToNext());
                        }
                        query.close();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            WritableArray createArray3 = Arguments.createArray();
                            createArray3.pushString(str);
                            createArray3.pushNull();
                            createArray.pushArray(createArray3);
                        }
                        hashSet.clear();
                    } catch (Exception e10) {
                        E6.a.L(ReactConstants.TAG, e10.getMessage(), e10);
                        this.f41262a.invoke(AbstractC5448b.b(null, e10.getMessage()), null);
                        query.close();
                        return;
                    }
                } catch (Throwable th2) {
                    query.close();
                    throw th2;
                }
            }
            this.f41262a.invoke(null, createArray);
        }
    }

    public class b extends GuardedAsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f41265a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f41266b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f41265a = callback;
            this.f41266b = readableArray;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            String str = null;
            WritableMap b10 = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f41265a.invoke(AbstractC5448b.a(null));
                return;
            }
            SQLiteStatement compileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.J().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.J().beginTransaction();
                    for (int i10 = 0; i10 < this.f41266b.size(); i10++) {
                        if (this.f41266b.getArray(i10).size() != 2) {
                            WritableMap d10 = AbstractC5448b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                                return;
                            } catch (Exception e10) {
                                e = e10;
                                E6.a.L(ReactConstants.TAG, e.getMessage(), e);
                                if (d10 != null) {
                                    return;
                                }
                            }
                        } else if (this.f41266b.getArray(i10).getString(0) == null) {
                            WritableMap c10 = AbstractC5448b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                                return;
                            } catch (Exception e11) {
                                e = e11;
                                E6.a.L(ReactConstants.TAG, e.getMessage(), e);
                                if (c10 != null) {
                                    return;
                                }
                            }
                        } else if (this.f41266b.getArray(i10).getString(1) == null) {
                            WritableMap d11 = AbstractC5448b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                                return;
                            } catch (Exception e12) {
                                e = e12;
                                E6.a.L(ReactConstants.TAG, e.getMessage(), e);
                                if (d11 != null) {
                                    return;
                                }
                            }
                        } else {
                            compileStatement.clearBindings();
                            compileStatement.bindString(1, this.f41266b.getArray(i10).getString(0));
                            compileStatement.bindString(2, this.f41266b.getArray(i10).getString(1));
                            compileStatement.execute();
                        }
                        AbstractC5448b.b(null, e.getMessage());
                        return;
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.J().setTransactionSuccessful();
                } finally {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                    } catch (Exception e13) {
                        E6.a.L(ReactConstants.TAG, e13.getMessage(), e13);
                        AbstractC5448b.b(null, e13.getMessage());
                    }
                }
            } catch (Exception e14) {
                E6.a.L(ReactConstants.TAG, e14.getMessage(), e14);
                WritableMap b11 = AbstractC5448b.b(null, e14.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                } catch (Exception e15) {
                    E6.a.L(ReactConstants.TAG, e15.getMessage(), e15);
                    if (b11 == null) {
                        b10 = AbstractC5448b.b(null, e15.getMessage());
                    }
                }
                b10 = b11;
            }
            if (b10 != null) {
                this.f41265a.invoke(b10);
            } else {
                this.f41265a.invoke(new Object[0]);
            }
        }
    }

    public class c extends GuardedAsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f41268a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f41269b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f41268a = callback;
            this.f41269b = readableArray;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f41268a.invoke(AbstractC5448b.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.J().beginTransaction();
                    for (int i10 = 0; i10 < this.f41269b.size(); i10 += 999) {
                        int min = Math.min(this.f41269b.size() - i10, 999);
                        AsyncStorageModule.this.mReactDatabaseSupplier.J().delete("catalystLocalStorage", AbstractC5447a.a(min), AbstractC5447a.b(this.f41269b, i10, min));
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.J().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                    } catch (Exception e10) {
                        E6.a.L(ReactConstants.TAG, e10.getMessage(), e10);
                        writableMap = AbstractC5448b.b(null, e10.getMessage());
                    }
                } catch (Exception e11) {
                    E6.a.L(ReactConstants.TAG, e11.getMessage(), e11);
                    WritableMap b10 = AbstractC5448b.b(null, e11.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                    } catch (Exception e12) {
                        E6.a.L(ReactConstants.TAG, e12.getMessage(), e12);
                        if (b10 == null) {
                            writableMap = AbstractC5448b.b(null, e12.getMessage());
                        }
                    }
                    writableMap = b10;
                }
                if (writableMap != null) {
                    this.f41268a.invoke(writableMap);
                } else {
                    this.f41268a.invoke(new Object[0]);
                }
            } catch (Throwable th2) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                } catch (Exception e13) {
                    E6.a.L(ReactConstants.TAG, e13.getMessage(), e13);
                    AbstractC5448b.b(null, e13.getMessage());
                }
                throw th2;
            }
        }
    }

    public class d extends GuardedAsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f41271a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f41272b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f41271a = callback;
            this.f41272b = readableArray;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            String str = null;
            WritableMap b10 = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f41271a.invoke(AbstractC5448b.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.J().beginTransaction();
                    for (int i10 = 0; i10 < this.f41272b.size(); i10++) {
                        if (this.f41272b.getArray(i10).size() != 2) {
                            WritableMap d10 = AbstractC5448b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                                return;
                            } catch (Exception e10) {
                                e = e10;
                                E6.a.L(ReactConstants.TAG, e.getMessage(), e);
                                if (d10 != null) {
                                    return;
                                }
                            }
                        } else if (this.f41272b.getArray(i10).getString(0) == null) {
                            WritableMap c10 = AbstractC5448b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                                return;
                            } catch (Exception e11) {
                                e = e11;
                                E6.a.L(ReactConstants.TAG, e.getMessage(), e);
                                if (c10 != null) {
                                    return;
                                }
                            }
                        } else if (this.f41272b.getArray(i10).getString(1) == null) {
                            WritableMap d11 = AbstractC5448b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                                return;
                            } catch (Exception e12) {
                                e = e12;
                                E6.a.L(ReactConstants.TAG, e.getMessage(), e);
                                if (d11 != null) {
                                    return;
                                }
                            }
                        } else if (!AbstractC5447a.e(AsyncStorageModule.this.mReactDatabaseSupplier.J(), this.f41272b.getArray(i10).getString(0), this.f41272b.getArray(i10).getString(1))) {
                            WritableMap a10 = AbstractC5448b.a(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                                return;
                            } catch (Exception e13) {
                                e = e13;
                                E6.a.L(ReactConstants.TAG, e.getMessage(), e);
                                if (a10 != null) {
                                    return;
                                }
                            }
                        }
                        AbstractC5448b.b(null, e.getMessage());
                        return;
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.J().setTransactionSuccessful();
                } finally {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                    } catch (Exception e14) {
                        E6.a.L(ReactConstants.TAG, e14.getMessage(), e14);
                        AbstractC5448b.b(null, e14.getMessage());
                    }
                }
            } catch (Exception e15) {
                E6.a.L(ReactConstants.TAG, e15.getMessage(), e15);
                WritableMap b11 = AbstractC5448b.b(null, e15.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.J().endTransaction();
                } catch (Exception e16) {
                    E6.a.L(ReactConstants.TAG, e16.getMessage(), e16);
                    if (b11 == null) {
                        b10 = AbstractC5448b.b(null, e16.getMessage());
                    }
                }
                b10 = b11;
            }
            if (b10 != null) {
                this.f41271a.invoke(b10);
            } else {
                this.f41271a.invoke(new Object[0]);
            }
        }
    }

    public class e extends GuardedAsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f41274a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f41274a = callback;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.B()) {
                this.f41274a.invoke(AbstractC5448b.a(null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.d();
                this.f41274a.invoke(new Object[0]);
            } catch (Exception e10) {
                E6.a.L(ReactConstants.TAG, e10.getMessage(), e10);
                this.f41274a.invoke(AbstractC5448b.b(null, e10.getMessage()));
            }
        }
    }

    public class f extends GuardedAsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f41276a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f41276a = callback;
        }

        /* JADX WARN: Finally extract failed */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f41276a.invoke(AbstractC5448b.a(null), null);
                return;
            }
            WritableArray createArray = Arguments.createArray();
            Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.J().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
            try {
                try {
                    if (query.moveToFirst()) {
                        do {
                            createArray.pushString(query.getString(0));
                        } while (query.moveToNext());
                    }
                    query.close();
                    this.f41276a.invoke(null, createArray);
                } catch (Exception e10) {
                    E6.a.L(ReactConstants.TAG, e10.getMessage(), e10);
                    this.f41276a.invoke(AbstractC5448b.b(null, e10.getMessage()), null);
                    query.close();
                }
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.B();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void getAllKeys(Callback callback) {
        new f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCAsyncStorage";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.mShuttingDown = true;
        this.mReactDatabaseSupplier.k();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(AbstractC5448b.c(null), null);
        } else {
            new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @VisibleForTesting
    public AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        AbstractC5454h.g(reactApplicationContext);
        this.executor = new ExecutorC5458l(executor);
        this.mReactDatabaseSupplier = C5457k.U(reactApplicationContext);
    }
}
